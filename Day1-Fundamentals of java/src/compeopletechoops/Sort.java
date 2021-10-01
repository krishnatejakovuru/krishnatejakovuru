package compeopletechoops;
//wite the program sorting array

public class Sort {

	public static void main(String[] args) {
		int arr[] = { 23, 58, 13, 12, 125 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i] + " ");
		}
	}
}
