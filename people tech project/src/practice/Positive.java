package practice;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		s = s.toLowerCase();
		System.out.println(checkpositive(s));

	}

	private static boolean checkpositive(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] > ch[i + 1]) {
				System.out.println("It's not positive string");
				return false;
			}
		}
		return true;
	}

}
