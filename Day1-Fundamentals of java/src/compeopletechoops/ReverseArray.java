package compeopletechoops;
//write the program reverse the array

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 12, 89, 56, 48, 78, 96, 32 };
		System.out.println("Given array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");

		}
		System.out.println("\nafetr reverse the array");
		for (int i = arr.length; i > 0; i--) {
			System.out.println(arr[i - 1] + "");
		}
	}

}
