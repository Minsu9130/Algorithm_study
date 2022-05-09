package DFS_BFS����;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CalfFind {
	
	int answer=0;
	int[] dis= {1, -1, 5};
	int[] ch;
 	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		
		ch = new int[10001];  // �Է� ���� �� �ִ� ���� ��ǥ�� 1~10000 �̹Ƿ� �迭 ũ�� 100001
		ch[s]=1;              // ������ ó�� �ִ� �ڸ� üũ �迭 1
		Q.offer(s);
		int L = 0;	 		  // ���� ���� ����
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
