package Array;

import java.util.Scanner;

public class TurnPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(arr));
	}
	
	public static String solution(int[] arr) {
		
		String answer = "";                       
		
		int[] prime = new int[100000];
		
		prime[1] = 1;
		
		for (int i=2; i < 100000; i++) {
			if (prime[i] == 0) {
				// i의 배수는 무조건 i를 약수로 가지므로 소수가 아님
				// 배열을 1로 채워 놓음
				for (int j=i+i; j < 100000; j+=i) {
					prime[j] = 1;
				}
			}
		}
		
		String str = "";
		for (int i=0; i < arr.length; i++) {
			str = new StringBuilder(Integer.toString(arr[i])).reverse().toString();
			if (str.startsWith("0")) {
				for(int j=0; j <= str.length(); j++) {
					if(str.startsWith("0")) {
						str = str.replaceFirst("0", "");
					}
				}
			}
			
			int num = Integer.parseInt(str);
			if (prime[num] == 0) {
				answer += str + " ";
			}
		}
		
		return answer;
	}

}
