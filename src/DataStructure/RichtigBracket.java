package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class RichtigBracket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.println(solution(str));
	}
	public static String solution(String str) {
		
		String answer = "YES";
			
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			
			// �ݴ� ��ȣ�� ���� ��
			else {
				// �ݴ� ��ȣ�� ���� ������ ����ִٸ�
				if (stack.isEmpty()) return "NO";
				
				// �ݴ� ��ȣ�� ������ ���� ��ȣ pop
				stack.pop();
			}
		}
		
		// ���� ��ȣ�� ���� ���� ��
		if (!stack.isEmpty()) {
			return "NO";
		}
		return answer;
	}

}
