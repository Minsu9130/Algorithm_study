package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StudyPlan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str1 = input.next();
		String str2 = input.next();
		
		System.out.println(solution(str1, str2));
	}
	public static String solution(String str1, String str2) {
		
		String answer = "YES";
		
		Queue<Character> que = new LinkedList<>();
		
		for (char x : str1.toCharArray()) {
			que.offer(x);
		}
		
		for(char x : str2.toCharArray()) {
			
			// 필수과목이 포함되어 있고, 큐의 제일 상단에 있는 값과 
			// 같지 않으면 순서에 맞지 않는 것이기 때문에 같을 때만 poll
			if (que.contains(x) && que.peek() == x) {
				que.poll();
			}
		}
		
		// 큐에 값이 남아있다면 필수 과목을 순서대로 듣지 않아 큐가 제거되지 않은 것이므로 answer는 NO
		if (!que.isEmpty()) {
			return "NO";
		}
		return answer;
	}
}
