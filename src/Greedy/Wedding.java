package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class WeTime implements Comparable<WeTime> {
	public int time;
	public char state;
	WeTime (int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(WeTime o) {
		if(this.time == o.time) return this.state-o.state;  // 끝나는 시간이 같을 경우 시작시간이 빠른 것으로 리턴
		else return this.time-o.time;
	}
}


public class Wedding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<WeTime> arr = new ArrayList<>();
		
		for (int i=0; i < n; i++) {
			int s = input.nextInt();
			int e = input.nextInt();
			
			arr.add(new WeTime(s, 's'));
			arr.add(new WeTime(e, 'e'));
		}
		
		System.out.println(solution(arr, n));

	}
	
	private static int solution(ArrayList<WeTime> arr, int n) {
		int answer = Integer.MIN_VALUE;
		int max = 0;
		Collections.sort(arr);
		
		for (WeTime ob : arr) {

			if(ob.state == 's') max++;
			else max--;
			
			answer=Math.max(answer, max);
		}
		return answer;
	}

}
