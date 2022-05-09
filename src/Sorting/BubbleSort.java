package Sorting;

import java.util.Scanner;

// ���� ���� 
// ���� ������ �ѹ��� ���� ���� ���� ū ���� �����ʿ� ����
// �� Ƚ���� �ϳ��� �پ��
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
