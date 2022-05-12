package DFS_BFS활용;

import java.util.Scanner;

// 수열 추측하기
public class ProgressionGuess {
	
	static int[] b, p, ch;
	static int n, f;
	static boolean flag = false;
	static int[][] dy = new int[35][35];
	
	public static int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r]; // com[n][r]에 이미 값이 있는 경우 저장된 값을 반환
		if(n==r || r==0) return 1; 
		else {
			return dy[n][r]=combi(n-1, r-1)+combi(n-1, r); // return 하면서 값을 com[n][r]에 저장
		}
	}
	
	public static void DFS(int L, int sum) {
		if(flag) return;
		if(L == n) {
			if(sum == f) {
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
		}
		else {
			for(int i=1; i <= n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					DFS(L+1, sum+(p[L]*b[L])); 
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		f = input.nextInt();
		
		b = new int[n];
		p = new int[n];
		
		ch = new int[n+1];
		
		for(int i=0; i < n; i++) {
			b[i] = combi(n-1, i);
		}
		
		DFS(0, 0);

	}
	
}
