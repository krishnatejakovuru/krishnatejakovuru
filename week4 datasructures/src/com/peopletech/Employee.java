package com.peopletech;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String fName;
	String lName;
	int yearsOfExp;
	int pay;
	String dept;
	String location;

	public Employee(String fName, String lName, int yearsOfExp, int pay, String dept, String location) {

		this.fName = fName;
		this.lName = lName;
		this.yearsOfExp = yearsOfExp;
		this.pay = pay;
		this.dept = dept;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", yearsOfExp=" + yearsOfExp + ", pay=" + pay
				+ ", dept=" + dept + ", location=" + location + "]";
	}
}