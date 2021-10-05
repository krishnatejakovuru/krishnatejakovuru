package com.peopletech;

public class StudentList {
	Student head;

	public static void add(StudentList list, Student newStudent) {
		if (list.head == null)
			list.head = newStudent;
		// System.out.println("List is empty");
		else {
			Student trav = list.head;
			while (trav.getNext() != null)
				trav = trav.getNext();
			trav.setNext(newStudent);
		}

	}

	public static void addFirst(StudentList list, Student newStudent) {
		if (list.head == null)
			list.head = newStudent;
		else {
			newStudent.setNext(list.head);
			list.head = newStudent;
		}
	}

	public static void printList(StudentList list) {
		Student trav;
		if (list.head == null)
			System.out.println("Empty List");
		else {
			trav = list.head;
			while (trav.getNext() != null) {
				System.out.println(trav + "-->");
				trav = trav.getNext();
			}
		}
	}

	public static void remove(StudentList list, Student s) {
		if (list.head == null)
			System.out.println("Empty List");
		else if (list.head.getRollno() == s.getRollno()) {
			Student temp = list.head;
			list.head = list.head.getNext();
			temp = null;
		} else {
			Student curr = list.head;
			Student curr1 = null;
			while (curr1.getNext() != null) {
				if (curr.getRollno() == s.getRollno()) {
					curr.setNext(curr1.getNext());
					curr1 = null;
					break;
				}
				curr = curr1;
				curr1 = curr1.getNext();
			}
		}
	}

	public static void main(String[] args) {
		StudentList list = new StudentList();
		list.add(list, new Student(12, "Sai", "cse"));
		list.add(list, new Student(16, "krishna", "ee"));
		list.add(list, new Student(15, "teja", "ece"));
		list.add(list, new Student(13, "naresh", "ce"));
		printList(list);

	}

}
