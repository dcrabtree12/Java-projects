package edu.cscc.demo;

public class Employee {

	public static int number = 84;
	public static final int NUMBER = 0;

	private String name;
	private int ssn;

	public Employee(String name, int ssn) {
		setName(name);
		this.ssn = ssn;
		// NUMBER = 45;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public long computerPay(int rate, int hours) {
		return rate * hours;
	}

	public static long computeBonus() {
		return 1000;
	}
}
