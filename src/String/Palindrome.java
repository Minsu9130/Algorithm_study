package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();

		System.out.println(solution(str));


	}
	public static String solution(String str) {
		
		String answer = "NO";
		
		// replaceAll 에는 정규식 사용가능 
		// 알바펫이 아닌것은 모두 제거
		str = str.toUpperCase().replaceAll("[^A-Z]", "");

		String tmp = new StringBuilder(str).reverse().toString();
		
		if (str.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}

}
