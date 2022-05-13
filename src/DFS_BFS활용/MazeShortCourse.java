package DFS_BFS활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	public int x,y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class MazeShortCourse {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static int answer = Integer.MAX_VALUE;
	
	// DFS 방법 
//	public static void DFS(int x, int y, int sum) {
//		if(x==7 && y == 7) answer = Math.min(answer, sum);
//		else {
//			for (int i=0; i < 4; i++) {
//				int nx = x+dx[i];
//				int ny = y+dy[i];
//				
//				// 현재 좌표의 상하좌우 중 경계선이 있는지와 0이 있는지 확인
//				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
//					board[nx][ny] = 1;
//					DFS(nx, ny, sum+1);
//					board[nx][ny] = 0;
//				}
//			}
//		}
//	}
	
	// BFS 방법
	public static void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1;
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0; i < 4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				
				if(nx>=1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] =1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		board = new int[8][8];
		dis = new int[8][8];
		
		for (int i=1; i <= 7; i++) {
			for(int j=1; j <= 7; j++) {
				board[i][j] = input.nextInt();
			}
		}
		
		board[1][1] = 1;
		
		//DFS(1, 1, 0);
//		
//		if (answer == Integer.MAX_VALUE) {
//			answer = -1;
//		}
//		System.out.print(answer);
		
		BFS(1,1);
		
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}

}
