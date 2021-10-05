package com.peopletech;

public class Dou {

	Student head;
	static int size = 0;

	public static void addAfter(Dou list, Student name) {
		if (list.head == null)
			list.head = name;
		else {
			Student curr = list.head;

			while (curr.next != null)
				curr = curr.next;
			curr.next = name;

		}
		size++;
	}

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
		if (index > size)
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

	public static void printList(Dou list) {
		Student curr = list.head;
		if (list.head == null)
			System.out.println("List is Empty...");
		else {
			while (curr != null) {
				System.out.print(curr + " <-> ");
				curr = curr.next;
			}

		}

	}

	public static void main(String[] args) {
		Dou list = new Dou();
		list.add(list, new Student(12, "Neelkanth", "CS"));
		list.add(list, new Student(34, "Uttam", "IT"));
		list.add(list, new Student(71, "Gargesh", "EEE"));
		list.add(list, new Student(62, "Tanisha", "ECE"));
		list.add(list, new Student(73, "Kanak", "CS"));

		list.addAfter(list, new Student(86, "sandeep", "NIT"));
		printList(list);

	}
}
