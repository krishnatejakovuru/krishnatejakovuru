package com.peopletech;

public class StudentLinked {
	Student head;

	private void add(Dou list, Student student) {
		if (list.head == null)
			list.head = student;
		else {
			Student curr = list.head;
			while (curr.next != null)
				curr = curr.next;
			curr.next = student;

		}

	}

	public static Student get(Dou list, int index) {
		Student s = null;
		if (index > index)
			System.out.println("Invalid Index..");
		else {
			int temp = 1;
			s = list.head;
			while (s.next != null) {
				s = s.next;
				temp++;
				if (temp == index)
					break;
			}
		}
		return s;
	}
}
