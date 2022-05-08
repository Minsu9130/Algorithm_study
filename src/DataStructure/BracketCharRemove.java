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
			
			// 여는 괄호가 스택에 포함 되어 있으면 그 뒤로 오는 문자열은 push 하지 않도록 넘어감
			// 닫힘 괄호는 추가하면 안되기 때문에 x가 ')' 아닌 경우도 체크
			if (!stack.contains('(') && x != ')') {
				stack.push(x);
			}
		}
		
		return stack;
	}
}
