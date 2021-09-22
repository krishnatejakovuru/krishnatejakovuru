package bank;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;

	}

}

class hdfc extends Bank {
	int getRateOfInterest() {
		return 5;
	}
}
