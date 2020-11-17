package minigold;

import java.util.Arrays;

public class Solution11 {

	public static void main(String[] args) {
		String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
		
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(shirtSize)));
	}

	public int[] solution(String[] shirtSize) {
		String[] standard = {"XS", "S", "M", "L", "XL", "XXL"};
		int[] result = new int[6];
		
		for (int i = 0 ; i < standard.length ; i++) {
			for (int i2 = 0 ; i2 < shirtSize.length ; i2++) {
				if (standard[i] == shirtSize[i2]) {
					result[i]++;
				}
			}
		}
		
		return result;	
	}
}
