package practice;

import java.util.Comparator;

public class BookComparator implements Comparator<BookExample> {

	@Override
	public int compare(BookExample o1, BookExample o2) {
		String s1 =  o1.getName();
		String s2 = o2.getName();
		System.out.println(s1+"compare to :"+s2);
		return s1.compareTo(s2);
	}

}
