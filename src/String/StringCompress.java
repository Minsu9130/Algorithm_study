package String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();

		System.out.println(solution(str));

	}
	
	public static String solution(String str) {
		
		String answer = "";
		
		int count = 1;
		
		for (int i=0; i < str.length(); i++) {
			// 문자열 마지막 인덱스인 경우에 str의 length 범위를 벗어나면 안되므로 if문으로 경우 나눔
			if(i != str.length()-1) {
				// 다음 문자열과 같으면 count 증가
				if(str.charAt(i) == str.charAt(i+1)) {
					count++;
				}
				// 다를 경우 이전 문자열 추가하고 count가 1보다 클 경우 추가
				else {
					answer += str.charAt(i);
					if (count > 1)
						answer += count;
					count = 1;
				}
			}
			else {
				answer += str.charAt(i);
				if(count > 1) {
					answer += count;
				}
			}
		}
		return answer;
	}
}
