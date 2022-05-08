package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str1 = input.next();
		String str2 = input.next();
		
		System.out.println(solution(str1, str2));
	}
	
	public static String solution(String str1, String str2) {
		
		String answer = "YES";
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for (char key : str1.toCharArray()) {
			map1.put(key, map1.getOrDefault(key, 0)+1);
		}
		
		for (char key : str2.toCharArray()) {
			map2.put(key, map2.getOrDefault(key, 0)+1);
		}
		
		// 같은 키의 value 값이 하나라도 다르면 "NO"를 answer에 저장
		for(char key : map1.keySet()) {
			if (map1.get(key) != map2.get(key)) {
				answer = "NO";
			}
		}
		
		return answer;
	}
}
