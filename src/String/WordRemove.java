package String;

import java.util.Scanner;

public class WordRemove {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.println(solution(str));


	}
	public static String solution(String str) {
		
		String answer = "";
		
		// indexOf() 함수 사용
		// 현재 자릿수와 자릿수의 값이 쳐음 등장하는 index를 비교하여 중복 문자인지 판단
		for(int i=0; i < str.length(); i++) {			
			if( i == (str.indexOf(str.charAt(i)))) {
				answer += str.charAt(i);
			}
		}

		return answer;
	}

}
