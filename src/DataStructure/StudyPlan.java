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
			
			// �ʼ������� ���ԵǾ� �ְ�, ť�� ���� ��ܿ� �ִ� ���� 
			// ���� ������ ������ ���� �ʴ� ���̱� ������ ���� ���� poll
			if (que.contains(x) && que.peek() == x) {
				que.poll();
			}
		}
		
		// ť�� ���� �����ִٸ� �ʼ� ������ ������� ���� �ʾ� ť�� ���ŵ��� ���� ���̹Ƿ� answer�� NO
		if (!que.isEmpty()) {
			return "NO";
		}
		return answer;
	}
}
