package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i=0; i < n; i++) {
			arr1[i] = input.nextInt();
		}
		
		for (int i=0; i < n; i++) {
			arr2[i] = input.nextInt();
		}
		
		for (String x : solution(arr1, arr2)) {
			System.out.println(x);
		}
	}
	
	public static String[] solution(int[] arr1, int[] arr2) {
		
		String[] answer = new String[arr1.length];
		
		for (int i=0; i < arr1.length; i++) {
			// 비길 경우
			if (arr1[i] == arr2[i]) {
				answer[i] = "D";
			}
			// arr1이 숫자가 큰 경우
			else if(arr1[i] > arr2[i]) {
				if(arr1[i] == 3 && arr2[i] == 1) answer[i] = "B";
				else answer[i] = "A";
			}
			// arr2이 숫자가 큰 경우
			else {
				if(arr1[i] == 1 && arr2[i] == 3) answer[i] = "A";
				else answer[i] = "B";
				
			}
		}
		return answer;
	}

}
