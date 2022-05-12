package DFS_BFSȰ��;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// ���� ��ȯ
public class CoinChange {
	
	static int n, m, answer=Integer.MAX_VALUE;

	public static void DFS(int L, int sum, Integer[] coin) {
		if(L >= answer) return;
		if(sum > m) return;
		if(sum == m) {
			answer = Math.min(answer, L);			
		}
		else {
			for(int i=0; i < n; i++) {
				DFS(L+1, sum+coin[i], coin);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt(); // ���� ���� ����
		
		Integer[] coin = new Integer[n]; // ���� ������ ���� �迭
		
		for (int i=0; i < n; i++) {
			coin[i] = input.nextInt();
		}
		
		Arrays.sort(coin, Collections.reverseOrder()); // ��Ÿ���� ���̱� ���� �迭�� ū �� ���� �����ϵ��� �������� ����
		   											   // Collections.reverseOrder()�� ����Ϸ��� �迭�� �ڷ����� ��ü������ �����ؾ� ��

		m = input.nextInt(); // �Ž��� �� �ݾ�
	
		
		DFS(0, 0, coin);
		System.out.println(answer);
	}

}
