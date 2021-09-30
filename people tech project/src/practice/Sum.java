package practice;

public class Sum {

	public static int calculateSum(int n) {
		int i, sum = 0;
		for (i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		int result = calculateSum(10);
		System.out.println("Sum of 10 natural numbers is div by 3 & 5 is =" + result);
	}

}
