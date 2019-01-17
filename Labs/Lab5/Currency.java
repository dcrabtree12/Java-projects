/*
 Chapter: 5
 Programmer: Dayla Crabtree
 Class: Java Programming 1
 Filename: Applets and Swing Components
 Purpose: Shows conversions for dollars, euros, pounds, and rubles.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Currency {

	public static void main(String[] args) {
		DecimalFormat twoDigits = new DecimalFormat("####.00");
		// Variables
		String amount;
		double dollars = 0, euros = 0.91, pounds = 0.64, rubles = 61.73;

		// Prompts and input
		amount = JOptionPane.showInputDialog(null, "Enter your dollar amount: ");
		dollars = Double.parseDouble(amount);

		// Calculations
		euros = dollars * euros;
		pounds = dollars * pounds;
		rubles = dollars * rubles;

		// Will not show results if 0 is entered.
		if (dollars <= 0){
			System.exit(0);
		}

		// Output
		JOptionPane.showMessageDialog(null, "YOUR DOLLAR AMOUNT OF $" + twoDigits.format(dollars) + " is equal to " + twoDigits.format(euros) + " , "
		+ twoDigits.format(pounds) + " pounds and " + twoDigits.format(rubles) + " rubles.");


	}
}