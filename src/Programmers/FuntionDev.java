package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// ���α׷��ӽ� : ��� ���� (level2)
public class FuntionDev {

	public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		Queue<Integer> que = new LinkedList<>();
		
		// �� ��ɸ��� �۾��� �Ϸ�Ǵ� ��¥�� ť�� offer
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
		
		// que�� peek �Լ��� ���� �տ� �ִ� �۾��� �Ϸᳯ¥�� �������� 
		// �� ��¥���� �۾��ϼ��� ���� �� ������ ���� �� �� �ִ� ����� count �� �� ArrayList�� add
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
