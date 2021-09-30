package practice;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));

	}

	private static boolean checkNumber(int n) {

		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}

		return true;
	}

}
