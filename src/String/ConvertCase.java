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
		
		// Character�� �ҹ������� �빮������ Ȯ���ϴ� �Լ��� ����� �Ǻ� �� ��ȯ
//		for(char c : str.toCharArray()) {
//			if(Character.isLowerCase(c)) 
//				answer += Character.toUpperCase(c);
//			else
//				answer += Character.toLowerCase(c);
//		}		
		
		// �ƽ�Ű�ڵ�� ��ҹ��� �Ǻ� �� ��ȯ 
		for(char c : str.toCharArray()) {
			if(c >= 65 && c <= 90) // �ҹ��� �Ǻ��� c >= 97 && x <= 122
				answer += (char)(c + 32);
			else {
				answer += (char)(c - 32);
			}
		}
		return answer;
	}
}
