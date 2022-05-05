package Array;

import java.util.Scanner;

public class GridMaxSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[][] arr = new int[n][n];
	
		for (int i=0; i < n; i++) {
			for(int j=0; j<n; j++) {
				 arr[i][j] = input.nextInt();
			}
		}
		
		
		System.out.print(solution(arr));
	
	}
	
	public static int solution(int[][] arr) {
		
		int answer1 = 0;   // 가로 합 
		int answer2 = 0;   // 세로 합
		int answer3 = 0;   // 대각선 합
		int max = 0;
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0; j < arr.length; j++) {
				answer1 += arr[i][j];
				
				answer2 += arr[j][i];
				
				if (i == j)
					answer3 += arr[i][j];
			}
			
			if (answer1 > max) max = answer1;
			if (answer2 > max) max = answer2;
			answer1 = 0;
			answer2 = 0;
		}
		if (answer3 > max) max = answer3;
		
		return max;
	}

}
