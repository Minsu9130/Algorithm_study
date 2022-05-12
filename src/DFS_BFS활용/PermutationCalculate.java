package DFS_BFSȰ��;

import java.util.Scanner;

// ���� ���ϱ�
public class PermutationCalculate {

	static int n, m;
	static int[] ch, list, arr;

	public static void DFS(int L) {

		if(L == m) {
			for(int x : list) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i=0; i < n; i++) {
				if (ch[i] == 0) {	
					ch[i] = 1;
					list[L] = arr[i]; 
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		n = input.nextInt();	// �ڿ��� ����
		m = input.nextInt();	// �ڿ����� �̴� Ƚ��

		ch = new int[n];		// üũ �迭
		list = new int[m];		// ������ ��� �迭

		arr = new int[n];		// ���� �ڿ����� ��� �迭

		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		DFS(0);
	}

}
