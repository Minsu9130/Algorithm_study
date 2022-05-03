package String;

import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.println(solution(str));

	}

	public static String solution(String str) {
		
		String answer = "";
		
		// Character의 소문자인지 대문자인지 확인하는 함수를 사용해 판별 후 변환
//		for(char c : str.toCharArray()) {
//			if(Character.isLowerCase(c)) 
//				answer += Character.toUpperCase(c);
//			else
//				answer += Character.toLowerCase(c);
//		}		
		
		// 아스키코드로 대소문자 판별 후 변환 
		for(char c : str.toCharArray()) {
			if(c >= 65 && c <= 90) // 소문자 판별은 c >= 97 && x <= 122
				answer += (char)(c + 32);
			else {
				answer += (char)(c - 32);
			}
		}
		return answer;
	}
}
