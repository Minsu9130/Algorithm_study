package String;

import java.util.Scanner;

public class WordReverse2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.println(solution(str));


	}
	public static String solution(String str) {
		
		String answer = "";
		
		char[] ch = str.toCharArray();
		
		int lt = 0;
		int rt = ch.length-1;
		
		for (int i=0; i < ch.length; i++) {
			if (!Character.isAlphabetic(ch[lt])) {
				lt++;
			}
			else if(!Character.isAlphabetic(ch[rt])) {
				rt--;
			}
			else {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}		
			if (rt <= lt) break;
		}
		
		answer = String.valueOf(ch);
		
		return answer;
	}

}
