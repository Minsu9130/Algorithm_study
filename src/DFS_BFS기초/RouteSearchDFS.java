package DFS_BFS±‚√ ;

import java.util.Scanner;

public class RouteSearchDFS {
	
	static int n, m, answer =0;
	static int[] ch;
	static int[][] graph;
	
	public static void DFS(int v) {
		if(v == n) answer++;
		else {
			for (int i=1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		m = input.nextInt();
		
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		
		for (int i=0; i < m; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			graph[a][b] = 1;
		}
		
		ch[1]=1;
		DFS(1);
		System.out.println(answer);

	}
}
