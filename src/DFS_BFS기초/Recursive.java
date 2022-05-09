package DFS_BFS±‚√ ;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		DFS(3);
	} 
	
	public static void DFS(int n) {
		if(n == 0) return;
		else {
			System.out.print(n + " ");
			DFS(n-1);
		}
	}
}
