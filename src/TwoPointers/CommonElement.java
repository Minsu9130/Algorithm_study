package TwoPointers;


import java.util.*;


public class CommonElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		
		int[] arr1 = new int[n1];
		
		for (int i=0; i < n1; i++) {
			arr1[i] = input.nextInt();
		}
		
		int n2 = input.nextInt();
		
		int[] arr2 = new int[n2];
		
		for (int i=0; i < n2; i++) {
			arr2[i] = input.nextInt();
		}
		
		for (int x: solution(n1, n2, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}
	
	public static ArrayList<Integer> solution(int n1, int n2, int[] arr1, int[] arr2) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int p1 = 0, p2 = 0;
		
		while(p1 < n1 && p2 < n2) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			}
			else if (arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}
		
		return answer;
	}

}
