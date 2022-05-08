package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class BracketCharRemove {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		for (char x : solution(str)) {
			System.out.print(x);
		}

	}
	
	public static Stack<Character> solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			}
			else if(x == ')') {
				stack.pop();
			}
			
			// ���� ��ȣ�� ���ÿ� ���� �Ǿ� ������ �� �ڷ� ���� ���ڿ��� push ���� �ʵ��� �Ѿ
			// ���� ��ȣ�� �߰��ϸ� �ȵǱ� ������ x�� ')' �ƴ� ��쵵 üũ
			if (!stack.contains('(') && x != ')') {
				stack.push(x);
			}
		}
		
		return stack;
	}
}
