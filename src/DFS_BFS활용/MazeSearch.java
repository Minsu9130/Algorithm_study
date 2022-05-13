package DFS_BFS활용;

import java.util.HashMap;
import java.util.Scanner;

// 미로 탐색
public class MazeSearch {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board;
	static int answer=0;
	
	public static void DFS (int x, int y) {
		if(x==7 && y == 7) answer++;
		else {
			for (int i=0; i < 4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				// 현재 좌표의 상하좌우 중 경계선이 있는지와 0이 있는지 확인
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					DFS(nx, ny);
					board[nx][ny] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		board = new int[8][8];
		
		for (int i=1; i <= 7; i++) {
			for(int j=1; j <= 7; j++) {
				board[i][j] = input.nextInt();
			}
		}
		
		board[1][1] = 1;
		
		DFS(1, 1);
		
		System.out.print(answer);
	}
	

}
