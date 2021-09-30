package practice;

import java.util.Scanner;

public class Job {
	String sub = "_job";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String s = sc.next();
		System.out.println("String ends with_job is" + endswith(s));
		if (pos(s) == true) {
			System.out.println("right pos");
		} else {
			System.out.println();
		}
	}

	private static boolean pos(String s) {
		int i = s.indexOf("_job");
		if (i >= 8) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean endswith(String s) {
		if (s.endsWith("_job")) {
			return true;
		} else {
			return false;
		}
	}

}
