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
		// ���ڿ��� �տ��� �ڿ��� �о ������ Ȯ���ϱ� ���� �Ǿ� ���ۿ� �ǵ� ���ں��� ��
//		while (rt > lt) {
//			if(str.charAt(lt) != str.charAt(rt)) {		
//				answer = "NO";
//			}
//			lt++;
//			rt--;
//		}
//		

		// StringBuilder()�� reversr �Լ��� ������ �� ���� ���ڿ��� ������ �Ǵ�
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		
		return answer;
	}

}
