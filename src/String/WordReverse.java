package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		// N���� �ܾ �Է� ���� ���� ����
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
		
		// StringBuilder()�� ������� �ʰ� charAt�� ����� ������ 
//		String anser = "";
//		
//		for (int i=str.length()-1; i >= 0; i--) {
//			answer += str.charAt(i);
//		}
//		
//		return answer;
	}

}
