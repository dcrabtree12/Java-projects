/*
	Chapter 12:	 Travel Commission
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:	 TravelCommission.java
	Purpose:     Calculates the sales commission for a travel agency.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TravelCommission {

	public static void main(String[] args) {

	/* Variables */
		double dollars, answer;
		int empCode;

	/* Call Methods */
		dollars = getSales();
		empCode = getCode();
		answer = getComm(dollars,empCode);
		output(dollars, answer);
		finish();
	}

	/* Method allows user to enter sales amount. */
		public static double getSales() {
			double sales = 0.0;
			boolean done = false;

				while(!done) { // Program will continue to prompt question and error checking.

					// Prompt for input
					String amount = JOptionPane.showInputDialog(null, "Enter the sales amount\n (do not use commas or dollar signs) or click Cancel to exit. ");

					if (amount == null) finish(); // Makes program exit if cancel is clicked.

					// Exception handling for String input as well as input <= 0.
					try {

						sales = Double.parseDouble(amount); // User Input
						if (sales <= 0) throw new NumberFormatException();
						else done = true; //If true program continues to run normally.

					} catch (NumberFormatException e) {
						// Error Message
						JOptionPane.showMessageDialog(null, "Error - enter a number greater than 0.", "Error", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			return sales;
		}

	/* Method prompts the user for the type of sales. */
		public static int getCode() {
			 int code = 0;
			 boolean done = false;

			 	while(!done) { // Program will continue to prompt question and error checking.

				 	// Prompt for input
					String message = JOptionPane.showInputDialog(null, "enter the commission code: \n 1) Telephone Sales \n 2) In Store Sales \n 3) Outside Sales");

					if (message == null) finish(); // Makes program exit if cancel is clicked.

					// Exception handling for String input as well as input other than 1, 2 or 3.
					try {

						code = Integer.parseInt(message); // User Input
			 			if (code < 1 || code > 3) throw new NumberFormatException();
			 			else done = true; //If true program continues to run normally.

			 		} catch(NumberFormatException ex) {
				 		// Error Message
				 		JOptionPane.showMessageDialog(null, "Please enter a 1, 2, or 3.", "Error", JOptionPane.INFORMATION_MESSAGE);
			 		}
		 		}

			 return code;
		}

	/* Method returns the amount of the commission. */
		public static double getComm(double empSales, int empCode) {
			double commission = 0.0;

			// If 1,2, or 3 is chosen..
			switch(empCode) {
				case 1:
					commission = .10 * empSales;
					break;
				case 2:
					commission = .14 * empSales;
					break;
				case 3:
					commission = .18 * empSales;
					break;
			}
			return commission;
		}

	/* Method outputs message dialog box. */
		public static void output(double commission, double sales) {
			// Decimal Formatting
			DecimalFormat digits = new DecimalFormat("#,000.00");

			// Final Output
			JOptionPane.showMessageDialog(null, "Your commission on sales $" + digits.format(commission) + " is $" + digits.format(sales) + ".");
		}

	/* Method exits the program. */
		public static void finish() {
			System.exit(0);
		}
}
