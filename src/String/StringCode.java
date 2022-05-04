package String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String str = input.next();

		System.out.println(solution(n, str));

	}
	
	public static String solution(int n, String str) {
		
		String answer = "";
		
		String[] arr = new String[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = str.substring(0, 7).replace('#', '1').replace('*', '0');
			
			// Integer.parsrInt(���ڷ� �ٲٷ��� ��, ����������)�� ����Ͽ� 
			// arr[i] �� ����Ǿ� �ִ� ���� 2������ ��ȯ 
			int num = Integer.parseInt(arr[i], 2);
			
			answer += (char)num; 
			
			str = str.substring(7);
		}
		return answer;
	}

}
