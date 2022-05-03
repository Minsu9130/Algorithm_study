package String;

import java.util.Scanner;

public class NumberExtract {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.next();

		System.out.println(solution(str));

	}


	public static String solution(String str) {

		String answer = "";
		
		str = str.replaceAll("[^0-9]", "");
		
		while(true) {
			System.out.println(str);
			if (str.charAt(0) == '0') {
				System.out.println(str);
				str = str.substring(1);
			}
			if (str.charAt(0) != '0')
				break;
		}
		
		answer = str;
		
		return answer;
	}


}
