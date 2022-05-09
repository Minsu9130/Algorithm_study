package DFS_BFS기초;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CalfFind {
	
	int answer=0;
	int[] dis= {1, -1, 5};
	int[] ch;
 	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		
		ch = new int[10001];  // 입력 받을 수 있는 직선 좌표가 1~10000 이므로 배열 크기 100001
		ch[s]=1;              // 현수가 처음 있는 자리 체크 배열 1
		Q.offer(s);
		int L = 0;	 		  // 레벨 변수 선언
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for (int i=0; i < len; i++) {
				int x = Q.poll();
				for (int j=0; j < dis.length; j++) {
					int nx = x+dis[j];
					if(nx == e) return L+1;
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		CalfFind T = new CalfFind();
		
		Scanner input = new Scanner(System.in);
		
		int s = input.nextInt();
		int e = input.nextInt();
				
		System.out.println(T.BFS(s, e));
	}

}
