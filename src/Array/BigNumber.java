package Array;

import java.util.Scanner;

public class BigNumber {

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
		
		// 첫 번째 수는 무조건 출력해야 하므로 초기값을 arr[0]으로 지정 
		String answer = Integer.toString(arr[0]);
		
		// 두 번째 값 부터 for문 시작
		for (int i=1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				answer += " ";
				answer += Integer.toString(arr[i]);
			}
		}
		return answer;
	}

}
