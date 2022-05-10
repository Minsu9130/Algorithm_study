package DFS_BFS활용;

import java.util.Scanner;

public class SumSameSubset {
	
	static int n, total;        // n : 집합 개수, total: 집합 원소의 전체 합
	static String answer="NO";
	static boolean flag = false;
	public static void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if(sum > total/2) return;
		if(L == n) {
			if((total-sum) == sum) {
				answer = "YES";
				flag=true;
			}
		} 
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
			total += arr[i];
		}
		DFS(0, 0, arr);
		System.out.println(answer);
	}

}
