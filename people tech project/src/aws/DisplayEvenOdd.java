package aws;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DisplayEvenOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9);

		displayEvenNumbers(numbers);
		dispalyOddNumbers(numbers);
	}

	private static void displayEvenNumbers(List<Integer> numbers) {
		Predicate<Integer> isEven = (number) -> number % 2 == 0;
		System.out.println("Even numbers");
		numbers.stream().filter(isEven).forEach(System.out::println);

	}

	private static void dispalyOddNumbers(List<Integer> numbers) {
		Predicate<Integer> isOdd = (number) -> number % 2 != 0;
		System.out.println("odd numbers");
		numbers.stream().filter(isOdd).forEach(System.out::println);

	}

}
