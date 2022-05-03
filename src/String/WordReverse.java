package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		// N개의 단어를 입력 받을 변수 선언
		int n = input.nextInt();
		
		String[] str = new String[n];
		
		for (int i=0; i < n; i++) {
			str[i] = input.next();
//			String str = input.next();
//			System.out.println(solution(str));
		}
		
		for (String x : solution(n, str)) {
			System.out.println(x);
		}

	}

	public static ArrayList<String> solution(int n, String[] str) {

		ArrayList<String> answer = new ArrayList<>();
		
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
		
		// StringBuilder()를 사용하지 않고 charAt를 사용해 뒤집기 
//		String anser = "";
//		
//		for (int i=str.length()-1; i >= 0; i--) {
//			answer += str.charAt(i);
//		}
//		
//		return answer;
	}

}
