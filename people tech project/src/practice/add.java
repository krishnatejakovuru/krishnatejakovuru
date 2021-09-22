package practice;

import java.util.Scanner;

public class add {
	int a;

	int b;

	int sum;

	public void inputdata() {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter first number: ");

		a = in.nextInt();

		System.out.print("Enter second number: ");

		b = in.nextInt();

	}

	public void Calculate() {

		sum = a + b;

	}

	public void outputdata() {

		System.out.println("Sum = " + sum);

	}

	public static void main(String args[]) {

		add obj = new add();

		obj.inputdata();

		obj.Calculate();

		obj.outputdata();

	}

}
