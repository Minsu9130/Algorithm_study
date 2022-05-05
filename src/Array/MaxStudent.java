package Array;

import java.util.Scanner;

public class MaxStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(arr));

	}
	
	public static int solution(int[] arr) {
		
		// ù ��° �л��� ������ ���̹Ƿ� ���Ⱚ 1
		int answer = 1;
		int max = arr[0];
		
		// �� ��° �� ���� for�� ����
		for (int i=1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}

}
