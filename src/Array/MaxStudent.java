package Array;

import java.util.Scanner;

public class MaxStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(arr));

	}
	
	public static int solution(int[] arr) {
		
		// 첫 번째 학생은 무조건 보이므로 조기값 1
		int answer = 1;
		int max = arr[0];
		
		// 두 번째 값 부터 for문 시작
		for (int i=1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}

}
