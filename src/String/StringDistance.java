package String;

import java.util.Scanner;

public class StringDistance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		char t = input.next().charAt(0);
		
		int[] arr = new int[str.length()];
		
		arr = solution(str, t);
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static int[] solution(String str, char t) {
		
		int[] answer = new int[str.length()];
			
		int distance = 1000;
		
		for (int i=0; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				distance = 0;
				answer[i] = distance;
			}
			else {
				distance++;
				answer[i] = distance;
			}
		}
		
		distance = 1000;
		
		for (int i=str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == t) {
				distance = 0;
			}
			else {
				distance++;
				answer[i] = Math.min(answer[i], distance);
			}
		}
		
		return answer;
	}
}
