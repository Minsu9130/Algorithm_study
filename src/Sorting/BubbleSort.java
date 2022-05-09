package Sorting;

import java.util.Scanner;

// 버블 정렬 
// 버블 정렬은 한번에 턴을 통해 가장 큰 수를 오른쪽에 정렬
// 비교 횟수가 하나씩 줄어듬
public class BubbleSort {

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
			for(int j=0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}
}
