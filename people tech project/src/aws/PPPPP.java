package aws;

import java.util.Scanner;

public class PPPPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the number");
		int n = sc.nextInt();
		System.out.println("print numbers between 2 and " + n);
		for (int i = 2; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i + " ");

		}

	}
}
