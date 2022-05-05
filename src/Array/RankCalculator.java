package Array;

import java.util.Scanner;

public class RankCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int x : solution(arr)) {
			System.out.print(x + " ");
		}

	}
	
	public static int[] solution(int[] arr) {
		
		int[] answer = new int[arr.length];
		
		int count = 1;
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					count++;
				}
			}
			answer[i] = count;
			count = 1;
		}
		
		return answer;
	}

}
