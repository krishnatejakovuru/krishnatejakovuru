package compeopletechoops;
//find the occurence of an integer int he array 10

public class Occ {
	public static void main(String[] args) {
		int a[] = { 15, 25, 96, 47, 5, 20, 2, 20, 30, 40 };
		System.out.println(count(a));
	}

	public static int count(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 20) {
				count++;
			}

		}
		return count;

	}
}
