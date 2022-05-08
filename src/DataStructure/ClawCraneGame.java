package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class ClawCraneGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// board 의 가로 세로
		int n = input.nextInt();
		
		int[][] board = new int[n][n];
		
		for (int i=0; i < n; i++) {
			for(int j=0; j< n; j++) {
				board[i][j] = input.nextInt();
			}
		}
		
		// moves 의 배열의 길이
		int m = input.nextInt();
		
		int[] moves = new int[m];
		
		for (int i=0; i < m; i++) {			
			moves[i] = input.nextInt();
		}
		
		System.out.println(solution(n, board, m, moves));
	}

	public static int solution(int n, int[][] board, int m, int[] moves) {
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		int before = 0;
		
		for (int i=0; i < m; i++) {
			for (int j=0; j < n; j++) {
				if (board[j][moves[i]-1] != 0 ) {
					if (!stack.isEmpty() && before == board[j][moves[i]-1]) {
						stack.pop();
						answer += 2;
					}
					
					if (before != board[j][moves[i]-1]) {
						stack.push(board[j][moves[i]-1]);
					}
					before = stack.lastElement();
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
