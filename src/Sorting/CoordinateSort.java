package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// �����Ǵ� Point Ŭ���� 
// Comparable�� �������̽� �̿�
class Point implements Comparable<Point> {
	public int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if (this.x == o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}
public class CoordinateSort {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i=0; i < n; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			arr.add(new Point(x, y));
		}
		
		Collections.sort(arr);
		
		for(Point o: arr) {
			System.out.println(o.x + " " + o.y);
		}
	}
}
