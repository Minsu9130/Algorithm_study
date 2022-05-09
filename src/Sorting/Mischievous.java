package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Mischievous {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(solution(n, arr));

	}

	private static String solution(int n, int[] arr) {
		String answer = "";
		
		int[] list = new int[n];
		
		for(int i=0; i < n; i++) {
			list[i] = arr[i];
		}
		Arrays.sort(list);
		
		for (int i=0; i < n; i++) {
			if(arr[i] != list[i]) {
				int num = i+1;
				answer += num + " ";
			}
		}
		
		return answer;
	}

}
