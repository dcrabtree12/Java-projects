/*
	Chapter 7:   MinimumValue
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:    MinimumValue.java
	Purpose:     Finds the smallest element based on inputted values.
*/

import java.util.Scanner;
import java.util.Arrays;

public class MinimumValue {
		private static Scanner input = new Scanner(System.in); // Allows Scanner to be used in more than one method.
		public static void main(String[] args) {

		// Array for double numbers.
		double[] numbers = new double[10];

		// Title of program.
		System.out.println("\tFind the minimum value");

		// Prompt for users to enter double numbers.
		System.out.println("Enter 10 double numbers: ");
			for (int i = 0; i < 10; i++) {
				numbers[i] = input.nextDouble();
			}

		// Outputs the smallest element.
		System.out.println("The smallest element is: " + min(numbers));

	}

	public static double min(double[] numbers) {

	// The variable = the first number inputed for the array.
	double minimum = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			// If the numbers array is < minimum it becomes the minimum value.
			if (numbers[i] < minimum) {
				 minimum = numbers[i];
			}
		}

		return minimum;
	}
}