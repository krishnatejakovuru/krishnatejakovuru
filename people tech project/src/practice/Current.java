package practice;

import java.time.*;
import java.util.*;

public class Current {

	public static void main(String[] args) {
		LocalDate todaydate = LocalDate.of(2019, 1, 26);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(todaydate, now);

		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}
}
