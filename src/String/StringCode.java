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
			
			// Integer.parsrInt(숫자로 바꾸려는 값, 몇진수인지)를 사용하여 
			// arr[i] 에 저장되어 있던 값을 2진수로 변환 
			int num = Integer.parseInt(arr[i], 2);
			
			answer += (char)num; 
			
			str = str.substring(7);
		}
		return answer;
	}

}
