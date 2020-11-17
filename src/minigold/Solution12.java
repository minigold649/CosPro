package minigold;

public class Solution12 {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		
		int price1 = 2500;
		String grade1 = "V";
		System.out.println(sol.solution(price1, grade1));
		
		int price2 = 96900;
		String grade2 = "S";
		System.out.println(sol.solution(price2, grade2));
	}

	public int solution(int price, String grade) {
		int result = 0;
		if (grade == "S") {
			result = (int)(price * 0.95);
		} else if (grade == "G") {
			result = price - (int)(price*0.1);
		} else if (grade == "V") {
			result = price - (int)(price*0.15);
		}
		return result;
	}
}
