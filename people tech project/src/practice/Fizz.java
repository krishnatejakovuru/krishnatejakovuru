package practice;

import java.util.Scanner;

public class Fizz {

	public static String fb(int n) {

		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz";
		} else if (n % 3 == 0) {
			return "Fizz";
		} else if (n % 5 == 0) {
			return "Buzz";
		} else {
			String s = Integer.toString(n);
			return s;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = scan.nextInt();

		System.out.println(fb(n));
	}

}
