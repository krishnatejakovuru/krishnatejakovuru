package practice;

import java.util.Scanner;

public class SumOf {
	static int sumOfCubes(int n) {

		int sum = 0;
		System.out.println("enter number");

		while (n > 0) {
			int s = n % 10;
			n = n / 10;
			sum += s * s * s;

		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println("sum = " + sumOfCubes(n));

	}

}
