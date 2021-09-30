package practice;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Choose one color : ");
		System.out.println("RED");
		System.out.println("YELLOW");
		System.out.println("GREEN");
		String color = scan.next();
		light(color);

	}

	public static void light(String color) {

		switch (color) {
		case "RED":
			System.out.println("stop");
			break;
		case "YELLOW":
			System.out.println("ready");
			break;
		case "GREEN":
			System.out.println("go");
			break;

		}

	}
}
