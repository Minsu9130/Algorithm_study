package DFS_BFS활용;

import java.util.Scanner;

// 조합 구하기
public class Combination {

	static int com[][];
	
	public static int DFS(int n, int r) {
		
		if(com[n][r] > 0) return com[n][r]; // com[n][r]에 이미 값이 있는 경우 저장된 값을 반환
		if(n==r || r==0) return 1; 
		else {
			return com[n][r]=DFS(n-1, r-1)+DFS(n-1, r); // return 하면서 값을 com[n][r]에 저장
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int r = input.nextInt();
		
		com = new int[n+1][r+1];
	
		System.out.println(DFS(n, r));
	}

}
