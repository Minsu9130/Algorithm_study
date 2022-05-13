package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
	public int s, e;
	Time (int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	public int compareTo (Time o) {
		if(this.e == o.e) return this.s-o.s;  // ������ �ð��� ���� ��� ���۽ð��� ���� ������ ����
		else return this.e-o.e;
		
	}
}

// ȸ�ǽ� ����
public class MeetingRoom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<Time> arr = new ArrayList<>();
		
		for (int i=0; i < n; i++) {
			int s = input.nextInt();
			int e = input.nextInt();
			
			arr.add(new Time(s, e));
		}
		
		System.out.println(solution(arr, n));
	}

	private static int solution(ArrayList<Time> arr, int n) {
		
		int answer = 0;
		
		Collections.sort(arr);
		
		
		int end = Integer.MIN_VALUE;
		for(Time ob : arr) {
			System.out.println(ob.s + " " + ob.e);
			
			// ���ĵ� �迭�� ù��° ������ �ð��� �����ϱ� ����
			if(end == Integer.MIN_VALUE) {
				end = ob.e;
				answer++;
			}
			
			// �������� ���� �迭�� ���۽ð��� ���ð��� ���ų� ũ�ٸ� ȸ�ǽ� count�� ������Ű�� ������ �ð� ����
			if(end <= ob.s ) {
				answer++;
				end = ob.e;
			}
		}
			
		return answer;
	}

}
