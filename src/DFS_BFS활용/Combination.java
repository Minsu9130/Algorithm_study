package DFS_BFSȰ��;

import java.util.Scanner;

// ���� ���ϱ�
public class Combination {

	static int com[][];
	
	public static int DFS(int n, int r) {
		
		if(com[n][r] > 0) return com[n][r]; // com[n][r]�� �̹� ���� �ִ� ��� ����� ���� ��ȯ
		if(n==r || r==0) return 1; 
		else {
			return com[n][r]=DFS(n-1, r-1)+DFS(n-1, r); // return �ϸ鼭 ���� com[n][r]�� ����
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
