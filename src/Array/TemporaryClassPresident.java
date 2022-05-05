package Array;

import java.util.Scanner;

public class TemporaryClassPresident {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[][] arr = new int[n+1][6];
			
		for (int i=1; i <= n; i++) {
			for(int j=1; j <= 5; j++) {
				 arr[i][j] = input.nextInt();
			}
		}
		
		System.out.print(solution(n, arr));

	}
	public static int solution(int n, int[][] arr) {
		
		int max = 0;
		int student = 0;
		
		for (int i=1; i <= n; i++) {
			int count = 0;   
			for(int j=1; j <= n; j++) {
				for (int k=1; k <= 5; k++) {
					String str = "";
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
			}
			
			if (max < count) {
				max = count;
				student = i;
			}
		}
		
		return student;
	}

}
