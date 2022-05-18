package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
	public int h,w;
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;
	}
}
// ¾¾¸§ ¼±¼ö
public class Wrestler {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<Body> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int h = input.nextInt();
			int w = input.nextInt();
			arr.add(new Body(h, w));
		}
		
		System.out.println(solution(arr, n));

	}
	
	public static int solution(ArrayList<Body> arr, int n) {
		
		int cnt = 0; 
		Collections.sort(arr);
		
		int max = Integer.MIN_VALUE;
		
		for(Body ob : arr) {
			if (ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		return cnt;
	}
}
