package DFS_BFS활용;

import java.util.Scanner;

// 중복 순열 구하기
public class PermutationRepetition {
	
	static int n, m;
	static int[] arr;
	
	public static void DFS(int L) {
		if(L == m) {
			for (int x: arr) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i=1; i <= n; i++) {
				arr[L] = i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();	// 1부터 N까지 구슬 범위
		m = input.nextInt();	// 구슬 뽑는 횟수
		
		arr = new int[m];
		
		DFS(0);
	}

}
