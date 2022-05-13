package DFS_BFSÈ°¿ë;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Point {
//	public int x,y;
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}
public class Tomato {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] box, ch;
	static int n,m;
	static Queue<Point> que = new LinkedList<>();
	public static void BFS() {
		while(!que.isEmpty()) {
			Point tmp = que.poll();
			for(int i=0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
					box[nx][ny] = 1;
					que.offer(new Point(nx, ny));
					ch[nx][ny] = ch[tmp.x][tmp.y]+1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		m = input.nextInt();
		n = input.nextInt();
		
		box = new int[n][m];
		ch = new int[n][m];
		
		for (int i=0; i < n; i++) {
			for(int j=0; j < m; j++) {
				box[i][j] = input.nextInt();
				if(box[i][j] == 1) que.offer(new Point(i,j));
			}
		}
		
		BFS();
		
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		
		for (int i=0; i < n; i++) {
			for(int j=0; j < m; j++) {
				if(box[i][j] == 0) flag = false; 
			}
		}
		
		if(flag) {
			for (int i=0; i < n; i++) {
				for(int j=0; j < m; j++) {
					answer = Math.max(answer, ch[i][j]);
				}
			}
			System.out.println(answer);
		}
		else System.out.print(-1);

	}
	
}
