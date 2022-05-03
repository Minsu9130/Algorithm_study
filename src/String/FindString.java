package String;

import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str = input.next();	// next() 문자열 하나를 읽어들임
		char ch = input.next().charAt(0); // 문자열 중 0번째인 것을 읽어들임
		
		System.out.println(solution(str, ch));

	}
	
	public static int solution(String str, char ch) {
		
		int answer = 0;
		
		// 대,소문자 구별이 없다고 했기 때문에 str, ch 모두 대문자로 변경
		str = str.toUpperCase();
		ch = Character.toUpperCase(ch);	// char인 문자열은 Chracter 함수 이용해서 대문자로 바꿈
		
		
//		for(int i=0; i < str.length(); i++) {
//			if(str.charAt(i) == ch)
//				answer++;
//		}
		
		// 다른 방법 : forEach문
		for(char c : str.toCharArray()) {
			if(c == ch)
				answer++;
		}
		
		return answer;
	}
}
