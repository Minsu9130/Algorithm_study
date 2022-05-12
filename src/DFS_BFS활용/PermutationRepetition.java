package DFS_BFSȰ��;

import java.util.Scanner;

// �ߺ� ���� ���ϱ�
public class PermutationRepetition {
	
	static int n, m;
	static int[] arr;
	
	public static void DFS(int L) {
		if(L == m) {
			for (int x: arr) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i=1; i <= n; i++) {
				arr[L] = i;
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();	// 1���� N���� ���� ����
		m = input.nextInt();	// ���� �̴� Ƚ��
		
		arr = new int[m];
		
		DFS(0);
	}

}
