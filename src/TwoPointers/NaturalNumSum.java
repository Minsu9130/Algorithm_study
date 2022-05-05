package TwoPointers;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();	
		
		int[] arr = new int[n];
		for (int i=1; i < n; i++) {
			arr[i] = i;
		}
		
		System.out.println(solution(n, arr));
	}
	public static int solution(int n, int[] arr) {
		
		int answer = 0;
			
		int lt = 1;
		int sum = 0;
		
		// sliding window
		for (int i=1; i < n; i++) {
			sum += arr[i];
			if (sum == n) answer ++;
			
			while (sum >= n) {
				sum -= arr[lt++];
				if(sum==n) answer ++;
			}
		}
		
		return answer;
	}

}
