package Sorting;

import java.util.Scanner;

// 삽입 정렬
// 첫번쨰 반복문 1번부터 시작 0번방은 건너뜀
// 두번쨰 반복문은 첫번째 반복문 보다 1작은 값부터 시작해서 
public class InsertionSort {

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
		
		for(int i=1; i < n; i++) {
			int tmp = arr[i], j;
			for(j=i-1; j >= 0; j--) {
				if(arr[j] > tmp) arr[j+1] = arr[j];
				else break;
			}
			
			arr[j+1] = tmp;
		}
		
		return arr;
	}
}
