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
			
			// 여는 괄호면 무조건 push
			if(str.charAt(i) == '(') {
				stack.push('(');
			}
			// 닫는 괄호일 때
			else {
				stack.pop();
				
				// 이전 문자열이 여는 괄호이면 레이저이므로 쇠막대기를 자르게 되어 스택 사이즈만큼 더해줌
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
