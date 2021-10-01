package compeopletechoops;
//find the kth[3]large and ketth[3rd]smallest number in an array

	public class larggeSmall {
		public static void main(String[] args) {

			int arr[] = { 10, 23, 56, 78, 34, 67, 90, 15, 47 };
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++)

				{
					int temp;
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(" 3rd smallest " + arr[2]);
			int lar = arr.length - 3;
			System.out.println("3rd largest " + arr[lar]);
		}

	}


