package DFS_BFS±‚√ ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphShortDistance {

	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] dis, ch;
	
	public static void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		
		ch[v] = 1;
		dis[v] = 0;
		Q.offer(v);
		
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			
			for(int nv : graph.get(cv)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		
		for (int i=0; i < m; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			graph.get(a).add(b);
		}
		
		BFS(1);
		for(int i=2; i < dis.length; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
