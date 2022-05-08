package Hash;

import java.util.*;

public class ClassPresident {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String str = input.next();
		
		System.out.println(solution(n, str));
	}
	public static char solution(int n, String str) {
		
		char answer = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
 
		return answer;
	}
}
