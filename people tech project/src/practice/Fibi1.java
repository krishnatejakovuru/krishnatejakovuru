package practice;

import java.util.Scanner;

public class Fibi1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a = 0, b = 1;
		noRecursuin(a, b, n);
		recursion(n-2, a, b);

	}

	static void noRecursuin(int a, int b, int n) {

		int sum = 0;
		for (int i = 2; i < n; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
		

	}

	static void recursion(int n, int a, int b) {

		int rem = 0;
		if (n > 0) {
			rem = a + b;
			a = b;
			b = rem;
			System.out.println(rem);
			recursion(n - 1, a, b);
		}

	}

}
