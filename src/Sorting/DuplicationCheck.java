package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicationCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(solution(n, arr));

	}

	private static String solution(int n, int[] arr) {
		String answer = "U";
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i < arr.length; i++) {
			if (list.contains(arr[i])) {
				System.out.println(arr[i]);
				return "D";
			}
			list.add(arr[i]);
		}
		return answer;
	}

}
