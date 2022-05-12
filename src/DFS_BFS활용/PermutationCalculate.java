package DFS_BFS활용;

import java.util.Scanner;

// 순열 구하기
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

		n = input.nextInt();	// 자연수 갯수
		m = input.nextInt();	// 자연수를 뽑는 횟수

		ch = new int[n];		// 체크 배열
		list = new int[m];		// 순열을 담는 배열

		arr = new int[n];		// 뽑은 자연수를 담는 배열

		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		DFS(0);
	}

}
