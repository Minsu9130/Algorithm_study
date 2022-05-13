package Programmers;

import java.util.ArrayList;
import java.util.Collections;

// 프로그래머스 : K번째 수
public class KthNumber {

	public static void main(String[] args) {
		
		int[] n = {1, 5, 2, 6, 3, 7, 4};
		
		int[][] c = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		for(int x : solution(n, c)) {
			System.out.println(x + " ");
		}
	}

	private static ArrayList<Integer> solution(int[] n, int[][] commands) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i=0; i < commands.length; i++) {
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			
			System.out.println(a + " " + b + " " + c);
			ArrayList<Integer> list = new ArrayList<>();
			
			for (int j=a; j <= b; j++) {
				list.add(n[j-1]);
			}
			
			Collections.sort(list);
			
			answer.add(list.get(c-1));
		
		}
		return answer;
	}

}
