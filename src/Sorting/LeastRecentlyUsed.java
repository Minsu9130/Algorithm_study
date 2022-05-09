package Sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class LeastRecentlyUsed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int s = input.nextInt();
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		
		for(int x: solution(s, n, arr)) {
			System.out.print(x + " ");
		}
		
	}
	
	public static Queue<Integer> solution(int s, int n, int[] arr) {
			
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=0; i < n; i++) {
			
			if(que.size() == s) {
				que.poll();
			}
			if(que.contains(arr[i])) {
				que.remove(arr[i]);
			}			
			que.offer(arr[i]);
			
		}
		
		Collections.reverse((List<?>) que);
		return que;
	}
}
