package String;

import java.util.Scanner;

public class CircularString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str = input.next();

		System.out.println(solution(str));

	}


	public static String solution(String str) {
		
		String answer = "NO";
		
//		String answer = "YES";
//		
//		str = str.toLowerCase();
//
//		int lt = 0;
//		int rt = str.length()-1;
//		
		// 문자열은 앞에서 뒤에서 읽어도 같은지 확인하기 위해 맨앞 문작와 맨뒷 문자부터 비교
//		while (rt > lt) {
//			if(str.charAt(lt) != str.charAt(rt)) {		
//				answer = "NO";
//			}
//			lt++;
//			rt--;
//		}
//		

		// StringBuilder()의 reversr 함수로 뒤집은 후 원래 문자열과 같은지 판단
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		
		return answer;
	}

}
