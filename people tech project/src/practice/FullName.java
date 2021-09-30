package practice;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			String firstName = "Sai krishna teja";
			String lastName = "";
			placeHolder(firstName, lastName);
		} catch (nameException e) {
			System.out.println(e.fullNameException());
		}

	}

	static void placeHolder(String firstName, String lastName) throws nameException {
		if (firstName.isEmpty() || lastName.isEmpty()) {
			throw new nameException();
		} else {
			System.out.println("Your name is :" + firstName + " " + lastName);
		}
	}

	public void validateFullName1(String fName, String lName) {
		
	}

}

class nameException extends Exception {

	public String fullNameException() {
		return " Getting errror please enter complete name";
	}

}
