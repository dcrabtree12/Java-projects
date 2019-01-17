package edu.cscc.demo;

import java.util.Date;

public class MainDude {

	public static void main(String[] args) {
		int i = 42;

		Employee employee = new Employee("Fred Flintstone", 000000000);
		Employee emp2 = employee;

		String employeeName = employee.getName();
		System.out.println(employeeName + " bonus is "
				            + Employee.computeBonus());
		System.out.println(employeeName + " pay is "
		                   + employee.computerPay(30, 5));

		employee = null;
		System.out.println(employeeName + " bonus is "
	            + Employee.computeBonus());
		System.out.println(employeeName + " pay is "
                + emp2.computerPay(30, 5));

		Date now = new Date();
		System.out.println(now.getTime());

		System.out.println(Math.random());
		Employee.NUMBER = 54;
		}
}
