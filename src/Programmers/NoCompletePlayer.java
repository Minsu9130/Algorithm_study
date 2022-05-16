package Programmers;

import java.util.HashMap;

public class NoCompletePlayer {

	public static String solution(String[] a, String[] b) {
		
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}	
		
		
		for (int i=0; i < b.length; i++) {
			if(map.containsKey(b[i])) {
				map.put(b[i], map.get(b[i])-1);
			}
		}
			
		for (String s: map.keySet()) {
			if(map.get(s) != 0 ) {
				answer = s;
				break;
			}
		}
		return answer;
	}

}
