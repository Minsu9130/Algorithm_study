package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.println(solution(str));

	}
	public static int solution(String str) {
		
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i < str.length(); i++) {
			
			// ���� ��ȣ�� ������ push
			if(str.charAt(i) == '(') {
				stack.push('(');
			}
			// �ݴ� ��ȣ�� ��
			else {
				stack.pop();
				
				// ���� ���ڿ��� ���� ��ȣ�̸� �������̹Ƿ� �踷��⸦ �ڸ��� �Ǿ� ���� �����ŭ ������
				if(str.charAt(i-1) == '(') {
					answer += stack.size();
				}
				else {
					answer++;
				}
			}
		}
		
		return answer;
	}
}
