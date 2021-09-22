package day1Fundamentals;

public class Parent {
	void print() {
		System.out.println("parent class");
		
	}
	

}
class Subclass1 extends Parent{
	void print () {
		System.out.println("subclass1");
	}
}
class Subclass2 extends Parent{
	void print() {
		System.out.println("subclass2");
	}
	
}
