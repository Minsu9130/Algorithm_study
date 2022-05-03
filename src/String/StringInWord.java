package String;

import java.util.Scanner;

public class StringInWord {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
		// ������ �Է¹��� ���� nextLine()
		String str = input.nextLine();
		
		System.out.println(solution(str));

	}

	public static String solution(String str) {

		String answer = "";
		
//		// ������ �������� �����Ͽ� �迭�� ����
//		String[] arr = str.split(" ");
//		
//		// ���� �� �ܾ��� ���̸� �����ϴ� ����
//		int max = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if (max < arr[i].length()) {
//				max = arr[i].length();
//				answer = arr[i];
//			}
//		}

		// ���ǿ��� �ٸ���� : indexOf �̿�
		
		int m = Integer.MIN_VALUE, pos;
		// indexOf�� ���� �߰�
		while ((pos=str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if (str.length() > m) answer = str;
		
		return answer;
	}
}
