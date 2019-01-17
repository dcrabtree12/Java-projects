/*
  Chapter: 4
  Programmer: Dayla Crabtree
  Class: Java Programming 1
  Filename: AscendingOrder.java
  Purpose: Make three cities in acending order alphabetically
*/

import java.util.Scanner;

public class AscendingOrder {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		String firstCity, secondCity, thirdCity;
		String temp;

		// Prompts
		System.out.println("\t\tAscending Order");

		System.out.print("\nEnter the first city: ");
		firstCity = input.nextLine();

		System.out.print("\nEnter the second city: ");
		secondCity = input.nextLine();

		System.out.print("\nEnter the third city: ");
		thirdCity = input.nextLine();

		// Compares city names
		// Uses temporary variable to swap values
		if (firstCity.compareTo(secondCity) > 0) {
				temp = firstCity;
				firstCity = secondCity;
				secondCity = temp;
		}
		if (firstCity.compareTo(thirdCity) > 0) {
				temp = firstCity;
				firstCity = thirdCity;
				thirdCity = temp;
		}
		if (secondCity.compareTo(thirdCity) > 0) {
				temp = secondCity;
				secondCity = thirdCity;
				thirdCity = temp;
		}

		// Output
		System.out.println("\nThe three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity + ".\n");

	}
}