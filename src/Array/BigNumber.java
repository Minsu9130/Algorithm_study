package Array;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(solution(arr));
	}
	
	public static String solution(int[] arr) {
		
		// ù ��° ���� ������ ����ؾ� �ϹǷ� �ʱⰪ�� arr[0]���� ���� 
		String answer = Integer.toString(arr[0]);
		
		// �� ��° �� ���� for�� ����
		for (int i=1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				answer += " ";
				answer += Integer.toString(arr[i]);
			}
		}
		return answer;
	}

}
