/*
  Chapter: 4
  Programmer: Dayla Crabtree
  Class: Java Programming 1
  Filename: Payroll.java
  Purpose: Prompts a user to enter an employee’s name, hours worked, hourly pay, federal and state tax rates.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);

		String employee;
		int hours;
		double payRate;
		double federalRate, federalTax;
		double grossPay;
		double stateRate, state;
		double total;
		double net;

		// Formats
		DecimalFormat money = new DecimalFormat("#0.00");
		DecimalFormat workedHours = new DecimalFormat("#0.0");

		System.out.println("\t\tPayroll Record\n"); // Title

		// Prompts for user
		System.out.print("Enter employee's name: ");
		employee = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		hours  = input.nextInt();

		System.out.print("Enter hourly pay rate: ");
		payRate = input.nextDouble();

		System.out.print("Enter federal tax witholding rate: ");
		federalRate = input.nextDouble();

		System.out.print("Enter state tax witholding rate: ");
		stateRate = input.nextDouble();

		// Calculations
		grossPay = hours * payRate;
		federalRate = federalRate * 100;
		stateRate = stateRate * 100;
		federalTax = grossPay * federalRate / 100;
		state = grossPay * stateRate / 100;
		total = federalTax + state;
		net = grossPay - total;

		// Outputs the employee name, hours, pay rate, and gross pay.
		System.out.println("\nEmployee Name: " + employee);
		System.out.println("Hours Worked: " + workedHours.format(hours));
		System.out.println("Pay Rate: $" + money.format(payRate));
		System.out.println("Gross Pay: $" + money.format(grossPay));

		// Outputs the deductions which are federal withholding, state withholding, and total deduction
		System.out.println("Deductions: ");
		System.out.println("\tFederal Withholding\t(" + federalRate + "%): $" + money.format(federalTax));
		System.out.println("\tState Withholding\t(" + stateRate + "%): $" + money.format(state));
		System.out.println("\tTotal Deduction:\t\t$" + money.format(total));

		// Outputs net pay
		System.out.println("Net Pay: $" + money.format(net));
	}
}
