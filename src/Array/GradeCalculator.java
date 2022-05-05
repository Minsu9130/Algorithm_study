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
				grade++;     // 현재 값이 1이면 다음 점수가 1이 오게되면 가산점이 더해진 점수로 더하기 위해 1를 더해줌
			}
			
			// 이전은 1이었지만 현재 0이 나왔기때문에 원래 점수인 1점으로 다시 초기화
			if(pre == 1 && arr[i] == 0) grade = 1;
				
			pre = arr[i];
			
		}
		
		return answer;
	}
}

