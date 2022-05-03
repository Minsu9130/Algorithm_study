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
		
		// replaceAll ���� ���Խ� ��밡�� 
		// �˹����� �ƴѰ��� ��� ����
		str = str.toUpperCase().replaceAll("[^A-Z]", "");

		String tmp = new StringBuilder(str).reverse().toString();
		
		if (str.equals(tmp)) {
			answer = "YES";
		}
		
		return answer;
	}

}
