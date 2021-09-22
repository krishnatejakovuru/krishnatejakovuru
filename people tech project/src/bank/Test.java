package bank;

class Test {
	public static void main(String args[]) {
		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest in sbi is: " + b.getRateOfInterest() + " %");
		b = new PNB();
		System.out.println("Rate of Interest in pnb is : " + b.getRateOfInterest() + " %");
		b = new hdfc();
		System.out.println("Rate of intrerst in hdfc is :" + b.getRateOfInterest() + "%");
	}
}
