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
			
			// 닫는 괄호가 들어올 떼
			else {
				// 닫는 괄호가 없고 스택이 비어있다면
				if (stack.isEmpty()) return "NO";
				
				// 닫는 괄호를 만나는 여는 괄호 pop
				stack.pop();
			}
		}
		
		// 여는 괄호가 남아 있을 때
		if (!stack.isEmpty()) {
			return "NO";
		}
		return answer;
	}

}
