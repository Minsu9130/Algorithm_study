package String;

import java.util.Scanner;

public class StringInWord {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
		// 문장을 입력받을 때는 nextLine()
		String str = input.nextLine();
		
		System.out.println(solution(str));

	}

	public static String solution(String str) {

		String answer = "";
		
//		// 문장을 공백으로 구분하여 배열에 저장
//		String[] arr = str.split(" ");
//		
//		// 가장 긴 단어의 길이를 저장하는 변수
//		int max = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if (max < arr[i].length()) {
//				max = arr[i].length();
//				answer = arr[i];
//			}
//		}

		// 강의에서 다른방법 : indexOf 이용
		
		int m = Integer.MIN_VALUE, pos;
		// indexOf로 띄어쓰기 발견
		while ((pos=str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if (str.length() > m) answer = str;
		
		return answer;
	}
}
