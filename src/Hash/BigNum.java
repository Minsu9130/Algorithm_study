package Hash;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class BigNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] arr = new int[n]; 
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(n, k, arr));

	}
	
	public static int solution(int n, int k, int[] arr) {
		
		int answer = -1;
		
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		
		for (int i=0; i <  n; i++) {
			for (int j=i+1; j < n; j++) {
				for (int l =j+1; l < n; l++) {
					tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int count = 0;
		for(int x : tset) {
			count++;
			if (count == k) answer = x;
		}
		
		return answer;
	}	
}
