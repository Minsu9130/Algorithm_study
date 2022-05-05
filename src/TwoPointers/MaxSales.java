package TwoPointers;

import java.util.*;

public class MaxSales {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();	
		int k = input.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(n, k, arr));
	}
	
	public static int solution(int n, int k,  int[] arr) {
		
		int max = 0;
		int answer = 0;
		
		for (int i=0; i < k; i++) {
			answer += arr[i];
			max = answer;
		}
		
		// sliding window
		for (int i=k; i < n; i++) {
			answer = answer - arr[i-k] + arr[i];
		
			if (answer > max) {
				max = answer;
			}

		}
		
		return max;
	}
}
