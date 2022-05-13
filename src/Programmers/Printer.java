package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		int[] a = {2, 1, 2, 1, 2, 1, 2, 1, 2};
		int lo = 1;

		System.out.println(solution(a, lo));
	}
	public static int solution(int[] priorities, int location) {
		int answer = 1;

		Queue<Integer> que1 = new LinkedList<>(); // �Է� ���� �迭�� ������ ť
		Queue<Integer> que2 = new LinkedList<>(); // �Է� ���� �迭�� �ε����� ������ ť


		for(int i=0; i < priorities.length; i++) {
			que1.offer(priorities[i]);
			que2.offer(i);
		}     

		while (!que1.isEmpty()) {
			int size = que1.size();
			int first = que1.poll();
			int firstIndex = que2.poll();
			int max=Integer.MIN_VALUE;

			for(int x : que1) {
				if (max < x) {
					max = x;
				}
			}

			if (first < max) {
				que1.offer(first);
				que2.offer(firstIndex);
				answer--;
			}

			if (que1.size() == size-1) {
				if (firstIndex == location) {
					return answer;
				}
			}
			answer++;
		}     

		return answer;
	}

}
