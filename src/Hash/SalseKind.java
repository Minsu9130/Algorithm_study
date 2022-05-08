package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalseKind {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] arr = new int[n]; 
		
		for (int i=0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int x: solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int n, int k, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		answer.add(map.size());
		
		for(int i=k; i < n; i++) {
			
			// arr[i-k] 가 맨앞에 한개 였다면 삭제
			if (map.get(arr[i-k]) == 1) {
				map.remove(arr[i-k]);
			}
			
			// 1개 이상 이었다면 삭제하지 않고 value 값만 -1 해줌
			else {
				map.replace(arr[i-k], map.get(arr[i-k])-1);
			}
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			answer.add(map.size());
		}
		
		return answer;
	}
}
