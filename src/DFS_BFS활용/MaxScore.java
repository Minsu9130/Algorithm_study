package DFS_BFSȰ��;

import java.util.Scanner;

// �ִ� ���� ���ϱ�
// �κ� ������ �̿��� DFS
public class MaxScore {

	static int n, m, answer=Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();	// ������ ����
		m = input.nextInt();	// ���� �ð�
		
		int[] a = new int[n];	// ���� ������ ���� �迭
		int[] b = new int[n];	// ���� ���� �ɸ��� �ð��� ���� �迭
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
