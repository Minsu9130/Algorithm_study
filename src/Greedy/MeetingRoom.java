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
		if(this.e == o.e) return this.s-o.s;  // 끝나는 시간이 같을 경우 시작시간이 빠른 것으로 리턴
		else return this.e-o.e;
		
	}
}

// 회의실 배정
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
			
			// 정렬된 배열의 첫번째 끝나는 시간을 저장하기 위해
			if(end == Integer.MIN_VALUE) {
				end = ob.e;
				answer++;
			}
			
			// 다음으로 오는 배열의 시작시간과 끝시간이 같거나 크다면 회의실 count를 증가시키고 끝나는 시간 저장
			if(end <= ob.s ) {
				answer++;
				end = ob.e;
			}
		}
			
		return answer;
	}

}
