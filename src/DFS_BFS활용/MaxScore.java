package DFS_BFS활용;

import java.util.Scanner;

// 최대 점수 구하기
// 부분 집합을 이용한 DFS
public class MaxScore {

	static int n, m, answer=Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();	// 문제의 갯수
		m = input.nextInt();	// 제한 시간
		
		int[] a = new int[n];	// 문제 점수를 담은 배열
		int[] b = new int[n];	// 문제 마다 걸리는 시간을 담은 배열
		for (int i=0; i < n; i++) {
			a[i] = input.nextInt();
			b[i] = input.nextInt();			
		}
		
		DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}

	public static void DFS(int L, int sum, int time, int[] ps, int[] pt) {
		
		if(time > m) return;
		if(L==n) {			
			answer = Math.max(answer, sum);			
		}
		else {
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
			DFS(L+1, sum, time, ps, pt);
		}
		
	}

}
