package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(solution(n, m,arr));
	}

	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		// 오름차순 청렬
		Arrays.sort(arr);
		
		for (int i=0; i < n; i++) {
			
			// m이 몇번째 인지 찾으면 i+1를 반환
			if(arr[i] == m) {
				return i+1;
			}
		}
		
		return answer;
	}

}
