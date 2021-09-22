package practice;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type your first name: ");
		String firstname = input.next();
		System.out.print("Type your last name: ");
		String lastname = input.next();
		System.out.println();
		System.out.println("Hello \n" + firstname + " " + lastname);
	}
}
