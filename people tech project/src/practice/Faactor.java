package practice;

public class Faactor {
	public static void main(String[] args) {
		int i = 250, end = 500;
		for (int n = 1; n <= end; n++) {
			if (i % n == 0)
				System.out.print(n + " ");
		}
	}

}
