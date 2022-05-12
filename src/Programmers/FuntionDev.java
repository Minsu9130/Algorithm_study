package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 프로그래머스 : 기능 개발 (level2)
public class FuntionDev {

	public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		Queue<Integer> que = new LinkedList<>();
		
		// 각 기능마다 작업이 완료되는 날짜를 큐에 offer
		for (int i=0; i < progresses.length; i++) {
			int count = 0;				
			while(true) {
				if (progresses[i] < 100) {
					progresses[i] += speeds[i];
					count++;
				}
				else {
					que.offer(count);
					break;
				}
			}
		}
		
		// que의 peek 함수로 제일 앞에 있는 작업의 완료날짜를 기준으로 
		// 그 날짜보다 작업일수가 많은 날 전까지 배포 할 수 있는 기능을 count 한 후 ArrayList에 add
		for (int i = 0; i < progresses.length; i++) {
			if(que.isEmpty()) break;
			int before = que.peek();
			int count = 0;
			while(true) {
				if(que.isEmpty()) break;
				if(before < que.peek()) {
					break;
				}
				else {
					que.poll();
					count++;
				}
			}
			answer.add(count);
	
		}
	
		return answer;
	}
}
