package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str1 = input.next();
		String str2 = input.next();
		
		System.out.println(solution(str1, str2));

	}
	
	public static int solution(String str1, String str2) {
		
		int answer = 0;
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		
		for (int i=0; i < str2.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
		}
		
		if (map1.keySet().equals(map2.keySet())) {
			answer++;
		}
		
		for (int i=str2.length(); i < str1.length(); i++) {
	
			if (map1.get(str1.charAt(i-str2.length())) == 1) {
				map1.remove(str1.charAt(i-str2.length()));
			}
			else {
				map1.replace(str1.charAt(i-str2.length()), map1.get(str1.charAt(i-str2.length()))-1);
			}
			
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
			
			if (map1.equals(map2)) {
				answer++;
			}
		}
		
		return answer;
	}	
}
