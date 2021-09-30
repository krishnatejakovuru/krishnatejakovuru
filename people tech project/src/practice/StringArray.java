package practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = { "sai", "krishna","teja","kovuru" };
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);

		}
		int n = s.length - 1;
		int mid = (n / 2);
		for (int i = 0; i <= mid; i++) {
			System.out.print(s[i].toLowerCase() + " ");
		}
		for (int i = mid + 1; i <= n; i++) {
			System.out.print(s[i].toUpperCase() + " ");
		}

	}

}
