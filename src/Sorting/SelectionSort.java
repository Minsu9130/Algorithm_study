package Sorting;

import java.util.Scanner;

// 선택 정렬
public class SelectionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int n, int[] arr) {

		for(int i=0; i < n-1; i++) {
			int idx = i;
			for(int j=i+1; j < n; j++) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
			}
			
			int temp =  arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		return arr;
	}
	
	
}
