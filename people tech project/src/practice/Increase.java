package practice;

import java.util.Scanner;

public class Increase {

	public static void main(String[] args) {

		System.out.println("give number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(verifyNumber(n));
	}

	private static boolean verifyNumber(int n) {

		while (n > 0) {
			int ft = n % 10;

			n = n / 10;
			int st = n % 10;

			if (ft < st) {
				return false;
			}
		}

		return true;
	}

}
