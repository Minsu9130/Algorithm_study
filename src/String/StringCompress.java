package String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();

		System.out.println(solution(str));

	}
	
	public static String solution(String str) {
		
		String answer = "";
		
		int count = 1;
		
		for (int i=0; i < str.length(); i++) {
			// ���ڿ� ������ �ε����� ��쿡 str�� length ������ ����� �ȵǹǷ� if������ ��� ����
			if(i != str.length()-1) {
				// ���� ���ڿ��� ������ count ����
				if(str.charAt(i) == str.charAt(i+1)) {
					count++;
				}
				// �ٸ� ��� ���� ���ڿ� �߰��ϰ� count�� 1���� Ŭ ��� �߰�
				else {
					answer += str.charAt(i);
					if (count > 1)
						answer += count;
					count = 1;
				}
			}
			else {
				answer += str.charAt(i);
				if(count > 1) {
					answer += count;
				}
			}
		}
		return answer;
	}
}
