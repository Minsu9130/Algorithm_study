package Array;

import java.util.Scanner;

public class Mountaintop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[][] arr = new int[n+2][n+2];
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0; j< arr.length; j++) {
				 arr[i][j] = 0;
			}
		}
			
		for (int i=1; i < n+1; i++) {
			for(int j=1; j< n+1; j++) {
				 arr[i][j] = input.nextInt();
			}
		}
		
		System.out.print(solution(arr));

	}
	public static int solution(int[][] arr) {
		
		int answer = 0;   
		
		for (int i=1; i < arr.length-1; i++) {
			for(int j=1; j < arr.length-1; j++) {
				int mon = arr[i][j];
				if (mon > arr[i-1][j] && mon > arr[i][j-1] 
						&& mon > arr[i+1][j] && mon > arr[i][j+1]) {
					answer++;
				}
			}
		}
		
		return answer;
	}
}
