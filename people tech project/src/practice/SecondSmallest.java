package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static int getSecondsmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pleae Enter array length:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		SecondSmallest.getSecondsmallest(arr);
		System.out.println("Second smallest array is:" + arr[1]);
	}

}
