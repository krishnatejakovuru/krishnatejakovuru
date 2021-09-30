package practice;

public class Dif {
	public static int calculateDiffernce(int n) {
		int squareofsum = 0, sumofsquare = 0;
		for (int i = 1; i <= n; i++) {
			sumofsquare += (i * i);
			squareofsum += i;
		}
		System.out.println("Sum of squares " + sumofsquare);
		System.out.println("square of sum" + (squareofsum * squareofsum));
		int diff = (squareofsum * squareofsum) - (sumofsquare);

		return diff;
	}

	public static void main(String[] args) {
		System.out.println(calculateDiffernce(10));
	}

}
