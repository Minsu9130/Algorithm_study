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
		
		// indexOf() �Լ� ���
		// ���� �ڸ����� �ڸ����� ���� ���� �����ϴ� index�� ���Ͽ� �ߺ� �������� �Ǵ�
		for(int i=0; i < str.length(); i++) {			
			if( i == (str.indexOf(str.charAt(i)))) {
				answer += str.charAt(i);
			}
		}

		return answer;
	}

}
