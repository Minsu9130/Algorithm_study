package TwoPointers;

import java.util.Scanner;

public class PartProgression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();	
		int m = input.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
	}
	public static int solution(int n, int m,  int[] arr) {
		
		int answer = 0;
			
		int lt = 0;
		int sum = 0;
		
		// sliding window
		for (int i=0; i < n; i++) {
			sum += arr[i];
			if (sum == m) answer ++;
			
			while (sum >= m) {
				sum -= arr[lt++];
				if(sum==m) answer ++;
			}
		}
		
		return answer;
	}
}
