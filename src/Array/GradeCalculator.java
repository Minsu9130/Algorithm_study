package Array;

import java.util.Scanner;

public class GradeCalculator {

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
		
		int answer = 0;
		int grade = 1;
		
		int pre = 0;		
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer+=grade;
				grade++;     // ���� ���� 1�̸� ���� ������ 1�� ���ԵǸ� �������� ������ ������ ���ϱ� ���� 1�� ������
			}
			
			// ������ 1�̾����� ���� 0�� ���Ա⶧���� ���� ������ 1������ �ٽ� �ʱ�ȭ
			if(pre == 1 && arr[i] == 0) grade = 1;
				
			pre = arr[i];
			
		}
		
		return answer;
	}
}

