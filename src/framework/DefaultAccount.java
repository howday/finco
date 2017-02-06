package framework;

public class DefaultAccount extends Account {

	public void deposit(double amount) {
		System.out.println("Default account deposited!!");
	}

	public void withdraw(double amount) {
		System.out.println("Default account withdrawn!!");
	}

	public double getBalance() {
		System.out.println("Default account get balance called!!");
		return 0.0d;
	}

}