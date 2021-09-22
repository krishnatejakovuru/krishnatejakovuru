package practice;

import java.util.Scanner;

public class Amsdr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("print first number: ");
		int no1 = in.nextInt();

		System.out.print("print second number: ");
		int no2 = in.nextInt();

		System.out.println(no1 + " + " + no2 + " = " + (no1 + no2));

		System.out.println(no1 + " - " + no2 + " = " + (no1 - no2));

		System.out.println(no1 + " x " + no2 + " = " + (no1 * no2));

		System.out.println(no1 + " / " + no2 + " = " + (no1 / no2));

		System.out.println(no1 + " mod " + no2 + " = " + (no1 % no2));
	}

}
