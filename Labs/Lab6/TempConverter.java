/*
	Chapter 6:	 Traffic Ticket
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:	 Trafic.java
	Purpose:	 Program prompts for conversions, temperature types, temperature, and outputs values based on prompts.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDigit = new DecimalFormat("#0.0");

		// Variables
		int conversion = 0, count = 1;
		double fahr = 0, cels = 0;

		// Title of program
		System.out.println("\tTemperature Converter");
		System.out.println("-------------------------------------------\n");

		do {  // Prompt for conversion
			System.out.println("How many conversions would you like to make: ");
			System.out.print("enter a number between 3 and 6 ");
			conversion = input.nextInt();

		} while(conversion <= 2 || conversion >= 7);

		for (int i = 1; i <= conversion; i++) {

			System.out.println("\nConversion # " + count + "\n");

			// Prompt for temperature type.
			System.out.println("To convert from celsius to fahrenheit type 1:");
			System.out.print("To convert from fahrenheit to celsius type 2: ");
			int temperatureType = input.nextInt();

			count++; // Increments

				// Prompt if user does not enter 1 or 2.
				if (temperatureType != 1 && temperatureType != 2) {

					System.out.println("To convert from celsius to fahrenheit type 1:");
					System.out.print("To convert from fahrenheit to celsius type 2: ");
					temperatureType = input.nextInt();
				}

				// Prompts if user enters 1 or 2.
				switch (temperatureType) {
					case 1:
						System.out.println("\nEnter a celsius temperature: ");
						cels = input.nextDouble();
						// Output
						System.out.println("\nThe celsius temperature of " + cels +
						" is equal to " + oneDigit.format(celsiusToFahrenheit(cels)) + ".");
						break;
					case 2:
						System.out.println("\nEnter a fahrenheit temperature: ");
						fahr = input.nextDouble();
						// Output
						System.out.println("\nThe fahrenheit temperature of " + fahr +
						" is equal to " + oneDigit.format(fahrenheitToCelsius(fahr)) + ".");
						break;
				}
		}
	}
		// Calculations
		public static double celsiusToFahrenheit(double cels) {
			return ((9.0 / 5) * cels + 32);
		}

		public static double fahrenheitToCelsius(double fahr) {
			return ((fahr - 32) * 5 / 9);
		}
}