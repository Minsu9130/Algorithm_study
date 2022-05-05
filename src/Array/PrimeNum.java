package Array;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		
		int answer = 0;                       
		
		int[] arr = new int[n+1];
		
		for (int i=2; i < n; i++) {
			if (arr[i] == 0) {
				answer++;
				// i�� ����� ������ i�� ����� �����Ƿ� �Ҽ��� �ƴ�
				// �迭�� 1�� ä�� ����
				for (int j=i; j < n; j+=i) {
					arr[j] = 1;
				}
			}
		}
		
		return answer;
	}

}
