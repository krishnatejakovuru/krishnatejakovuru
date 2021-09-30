package practice;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {

		Age a = new Age();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println(" please enter your age");
			int age = sc.nextInt();
			a.ageHolder(age);
		} catch (ageException e) {
			System.out.println(e.validateAge());
		}

	}

	public void ageHolder(int age) throws ageException {
		if (age > 18) {
			System.out.println(" your eligible man!");
		} else {
			throw new ageException();
		}
	}
}

class ageException extends Exception {

	public String validateAge() {
		return "your age should be more than 18;";
	}
}
