package practice;

import java.util.Scanner;

public class Series
{
	public static void main(String[] args) 
	{
		
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		int n = 1, count = 0;
		for (int i = 1; i <= a; i++)
		{
			System.out.println(n + " ");
			if (i % 2 != 0)
			{
				count += 8;

			}
			int temp = n + count;
			n = temp;
		}
	}

}
