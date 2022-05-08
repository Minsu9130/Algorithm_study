package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincessSave {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int k = input.nextInt();
		
		System.out.println(solution(n, k));

	}
	public static int solution(int n, int k) {
		
		int answer = 0;
		
		Queue<Integer> que = new LinkedList  <>();
		
		for(int i=1; i <= n; i++) {
			que.offer(i);
		}
		
		while(!que.isEmpty()) {
			
			// k가 아닐때는 poll한 후 그 리턴 된 값으로 다시 offer
			for(int i=1; i < k; i++) {
				que.offer(que.poll());
			}
			que.poll(); // k일땐 poll()
			
			// 큐 사이즈가 1이 되면 그 값을 answer에 저장 후 poll
			if(que.size() == 1) {
				answer = que.poll();
			}
		}
		
		return answer;
	}
}
