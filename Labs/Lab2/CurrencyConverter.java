/*
  Chapter: 3
  Programmer: Dayla Crabtree
  Class: Java Programming 1
  Filename: CurrencyConverter.java
  Purpose: Convert dollars to euros, pounds, and rubles.  Then output the ammount.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverter {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int amount = 3; // Creates value for switch statement
		double dollars = 0, euros = 0.91, pounds = 0.797, rubles = 59.775;

		DecimalFormat money = new DecimalFormat("#0.00"); // Creates decimal format

		System.out.println("\t\t Currency Converter"); // Title of program

		System.out.print("\nEnter the US dollar amount: ");
			dollars = input.nextDouble();

		// Displays values to input for conversions
		System.out.println("\nEnter a 1 to convert to euros");
		System.out.println("Enter a 2 to convert to pounds");
		System.out.println("Enter a 3 to convert to rubles");

		System.out.print("\nEnter your conversion choice: ");
			amount = input.nextInt();

		switch (amount) {
			case 1:
					System.out.print("\nThe dollar amount of $" + money.format(dollars) +
					" is equal to " + money.format(euros = dollars * euros) + " euros. \n");
					break;
			case 2:
					System.out.print("\nThe dollar amount of $" + money.format(dollars) +
					" is equal to " + money.format(pounds = dollars * pounds) + " pounds. \n");
					break;
			case 3:
					System.out.print("\nThe dollar amount of $" + money.format(dollars) +
					" is equal to " + money.format(rubles = dollars * rubles) + " rubles. \n");
		}
	}
}