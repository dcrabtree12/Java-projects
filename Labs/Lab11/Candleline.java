/*
	Chapter 11:	   Travel Commission
	Programmer:    Dayla Crabtree
	Class:         Java Programming 1
	Filename:	   Candleline.java
	Purpose:       Calculates candle cost based off of order and shipping.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Candleline {
	private static Scanner input = new Scanner(System.in); // Allows Scanner to be used in more than one method.

	public static void main(String[] args) {
		/* Variables */
		// DO NOT USE class variables inside the methods.
		final double candleCost, shippingCost;
		final int shippingType;


		/* Call Methods */
		candleCost = getCandlecost();
		shippingType = getShippingType();
		shippingCost = getShippingCost(candleCost, shippingType);
		output(candleCost, shippingCost);
	}

	/* Method includes exception handling for String input as well as input <= 0. */
	public static double getCandlecost() {
		double cost = 0.0;
		boolean done = false;

		/* Title */
		System.out.println("\t\tCandleLine - Candles Online\n");

			do {
				// Exception handling for String input as well as input <= 0.
				try {

					// Prompt for input
					System.out.print("Enter the cost of the candle order: ");
					String text = input.nextLine(); // User input

					cost = Double.parseDouble(text);
					if (cost <= 0) throw new NumberFormatException();
					else done = true; //If true program continues to run normally.

				} catch (NumberFormatException ex) {
					// Error Message
					System.out.println("Error, enter an dollar amount greater than 0 ");
				}
			} while(!done); // Program will continue to prompt question and error checking.

			return cost;
	}

	/* Method prompts the user for the type of shipping.  Include exception handling for String input as well as input other than 1, 2 or 3. */
	public static int getShippingType() {
		int shipType = 0;
		boolean done = false;

			do {
				// Exception handling for String input as well as input <= 0.
				try {

					// Prompt for input
					System.out.print("\nEnter the type of shipping: \n 1) Priorty (overnight) \n 2) Express (2 business days)"+
					"\n 3) Standard (3 to 7 business days)\nEnter type number: ");
					String text = input.nextLine(); // User input

					shipType = Integer.parseInt(text);
					if (shipType < 1 || shipType > 3) throw new NumberFormatException();
					else done = true; //If true program continues to run normally.

				} catch (NumberFormatException ex) {
					// Error Message
					System.out.print("\nError, enter a 1, 2, or 3 \n");
				}
			} while(!done); // Program will continue to prompt question and error checking.

			return shipType;
	}

	/* Method returns the cost of shipping. */
	public static double getShippingCost(double candleCost, int shippingType) {

		double ship = 0.0;

		// If 1,2, or 3 is chosen..
			switch(shippingType) {
				case 1: // Priority
					ship = 16.95;
					break;
				case 2: // Express
					ship = 13.95;
					break;
				case 3: // Standard
					// Orders of 100.00 and above and who choose standard shipping will receive free shipping.
					if (candleCost > 100.00) {
						ship = 0.0;
					} else {
						ship = 7.95;
						break;
					}
			}

			candleCost = ship;


		return candleCost;
	}

	/* Method displays the cost of the candle, cost of shipping and total cost. */
	public static void output(double candleCost, double shippingCost) {
		double total;
		total = shippingCost + candleCost;

		// Decimal Formatting
			DecimalFormat digits = new DecimalFormat("$#0.00");

		// Output
			System.out.println("\nThe candle cost of " + digits.format(candleCost) + " plus shipping costs of " + digits.format(shippingCost) + " equals " + digits.format(total) + ".");
	}
}