package DFS_BFSȰ��;

import java.util.Scanner;

public class SpottedDog {
	
	static int c, n, answer;
	static int min=Integer.MAX_VALUE;
	static int total;
	static int[] weight;
	
	public static void DFS(int L, int sum, int[] arr) {
		
		if(sum > c) return;		// sum�� c���� Ŀ���� DFS ����
		if (L == n) {
			// total-sum�� �������� sum�� total�� ����� ��
			if((total-sum) >= 0 && (total-sum) < min) {
				min = total-sum;
				answer = sum;
			}
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		c = input.nextInt();
		n = input.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
			total += arr[i];
		}
		
		
		DFS(0, 0, arr);
		
		System.out.println(answer);
	}

}
