package com.peopletech;

public class Studentdetails {
	Student head;

	public void add(Studentdetails list, Student newData) {
		if (head == null) {
			head = newData;
		} else {
			Student curr = list.head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newData;

		}
	}

	public void print(Studentdetails list) {
		if (head == null) {
			System.out.print("Emptylist");
		} else {
			Student temp = head;

			while (temp != null) {
				System.out.println(temp + "-->");
				temp = temp.next;
			}
			System.out.println("\n");
		}
	}

	public void get(Studentdetails list, int get) {
		int i = 1;
		if (head == null) {
			System.out.println("Empty list");
		} else {
			Student temp = head;
			while (temp != null) {
				if (i == get) {
					System.out.println(temp);
				}
				temp = temp.next;
				i++;
			}
		}

	}

	public void getFirst(Studentdetails list) {
		if (head == null) {
			System.out.println("Empty list");
		} else {
			Student temp = head;
			System.out.println(temp);
		}
	}

	public void getLast(Studentdetails list) {
		if (head == null) {
			System.out.print("empty list");
		} else {
			Student temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println(temp);
		}
	}

	public void getLastIndex(Studentdetails list) {
		int index = 1;
		if (head == null) {
			System.out.print("Empty list");
		} else {
			Student temp = head;
			while (temp.next != null) {
				temp = temp.next;
				index++;

			}
			System.out.println("last index is:" + index + "of student" + temp);
		}
	}

	public boolean contains(Studentdetails list, Student d) {
		if (head == null) {
			return false;
		} else {
			Student temp = head;
			while (temp.next != null) {
				if (temp.equals(d)) {
					return true;
				}
				temp = temp.next;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Studentdetails list = new Studentdetails();
		list.add(list, new Student(1, "Shanmukh", "IT"));
		list.add(list, new Student(2, "Harsha", "ece"));
		list.add(list, new Student(3, "Yuvi", "cse"));
		list.add(list, new Student(4, "Kalyan", "eee"));
		list.add(list, new Student(5, "Pradyumna", "cse"));

		list.print(list);
		System.out.println("get method");
		list.get(list, 2);
		System.out.println("get first");
		list.getFirst(list);
		System.out.println("get last");
		list.getLast(list);
		System.out.println("get last index");
		list.getLastIndex(list);
		System.out.println("\nData Contains: ");
		System.out.println(list.contains(list, new Student(25, "sri seshu", "cse")));

	}

}
