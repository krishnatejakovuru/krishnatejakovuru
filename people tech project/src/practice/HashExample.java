package practice;

import java.util.HashSet;
import java.util.Objects;

public class HashExample {
	public static void main(String[] args) {

		HashSet<BookExample> set = new HashSet<BookExample>();

		BookExample b1 = new BookExample(101, "C", "Yashwant kanetkar", "BPB", 8);
		BookExample b2 = new BookExample(102, "Data communication", "Forouzan", "Mc Graw Hill", 4);
		BookExample b3 = new BookExample(103, "Operating System", "Galyin", "wiley", 6);
		BookExample b4 = new BookExample(104, "civil engineer", "Galyin", "wiley", 6);
		BookExample b5 = new BookExample(105, "automation", "Yashwant kanetkar", "BPB", 8);

		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		

		for (BookExample b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
