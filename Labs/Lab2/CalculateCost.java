/*
  Chapter: 3
  Programmer: Dayla Crabtree
  Class: Java Programming 1
  Filename: CalculateCost.java
  Purpose:
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateCost {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int pounds;
		double dollars = 0;

		DecimalFormat money = new DecimalFormat("#0.00"); // Creates decimal format

		System.out.print("Enter package weight: ");
		pounds = input.nextInt();

		if (pounds <= 1 && pounds > 0)
			dollars = 3.50;

			else if (pounds <= 3 && pounds > 1)
				dollars = 5.50;

			else if (pounds <= 10 && pounds > 3)
				dollars = 8.50;

			else if (pounds <= 20 && pounds > 10)
				dollars = 10.50;

			else // Outputs when the package weight is > than 20.
				System.out.print("The package cannot be shipped. ");

		if (pounds > 0 && pounds <= 20) // Outputs the shipping cost
			System.out.print("The shipping cost is $" + money.format(dollars) + ". ");
	}
}