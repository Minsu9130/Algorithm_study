package String;

import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str = input.next();	// next() ���ڿ� �ϳ��� �о����
		char ch = input.next().charAt(0); // ���ڿ� �� 0��°�� ���� �о����
		
		System.out.println(solution(str, ch));

	}
	
	public static int solution(String str, char ch) {
		
		int answer = 0;
		
		// ��,�ҹ��� ������ ���ٰ� �߱� ������ str, ch ��� �빮�ڷ� ����
		str = str.toUpperCase();
		ch = Character.toUpperCase(ch);	// char�� ���ڿ��� Chracter �Լ� �̿��ؼ� �빮�ڷ� �ٲ�
		
		
//		for(int i=0; i < str.length(); i++) {
//			if(str.charAt(i) == ch)
//				answer++;
//		}
		
		// �ٸ� ��� : forEach��
		for(char c : str.toCharArray()) {
			if(c == ch)
				answer++;
		}
		
		return answer;
	}
}
