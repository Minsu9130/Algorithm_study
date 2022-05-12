package DFS_BFSÈ°¿ë;

import java.util.Scanner;

public class CombinationCalculate {

	static int n, m;
	static int[] list;

	public static void DFS(int L, int S) {
		if(L == m) {
			for(int x : list) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i=S; i <= n; i++) {
				list[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		n =input.nextInt();
		m =input.nextInt();

		list = new int[m];
		DFS(0, 1);

	}

}
