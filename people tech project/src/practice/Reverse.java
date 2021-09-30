package practice;

public class Reverse {

	public static void main(String[] args) {
		int arr[] = new int[] { 25, 26, 89, 74, 22, 65 };
		int temp = 0;
		System.out.println("Given array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}

		}
		System.out.println("\nsorted:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
