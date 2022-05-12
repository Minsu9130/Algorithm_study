package DFS_BFS활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 동전 교환
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
		
		n = input.nextInt(); // 동전 단위 갯수
		
		Integer[] coin = new Integer[n]; // 동전 단위를 담은 배열
		
		for (int i=0; i < n; i++) {
			coin[i] = input.nextInt();
		}
		
		Arrays.sort(coin, Collections.reverseOrder()); // 런타임을 줄이기 위해 배열의 큰 수 부터 적용하도록 내림차순 정렬
		   											   // Collections.reverseOrder()을 사용하려면 배열의 자료형을 객체형으로 선언해야 함

		m = input.nextInt(); // 거슬러 줄 금액
	
		
		DFS(0, 0, coin);
		System.out.println(answer);
	}

}
