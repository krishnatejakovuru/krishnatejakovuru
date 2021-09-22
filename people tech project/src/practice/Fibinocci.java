package practice;

public class Fibinocci {

	public static void main(String[] args) {

		int n = 100, s = 0, k = 1;

		System.out.println("Upto " + n + ": ");

		while (s <= n) {
			System.out.print(s + ", ");

			int n1 = s + k;
			s = k;
			k = n1;

		}
	}
}
