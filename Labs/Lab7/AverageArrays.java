/*
	Chapter 7:   AverageArrays
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:    AverageArrays.java
	Purpose:     Calculates average from 10 integers and doubles.
*/

import java.util.Scanner;

public class AverageArrays {
	private static Scanner input = new Scanner(System.in); // Allows Scanner to be used in more than one method.
	public static void main(String[] args) {

		// Arrays
		    int[] list1 = new int[10];
		    double[] list2 = new double[10];

		// Title of program.
			System.out.println("\tAverage Arrays");

		// Prompt for 10 integer values.
			System.out.println("Enter 10 integer values: ");
			for (int i = 0; i < 10; i++) {
				list1[i] = input.nextInt();
			}

		// Outputs average of integers.
		    System.out.println("The average of the ten integers is " + average(list1));

		// Prompt for 10 double values.
			System.out.println("Enter 10 double values: ");
			for (int i = 0; i < 10; i++) {
				list2[i] = input.nextDouble();
			}

		// Output average of doubles.
			System.out.println("The average of the ten doubles is " + average(list2));
	}

	public static int average(int[] list1) {

		// Variables
		int intSum = 0;
		int computeAverage = 0;

		for (int i = 0; i < 10; i++) {
			intSum += list1[i];
			// Adds values from array.
		}

		// Calculates and returns average.
		computeAverage = intSum / 10;
		return computeAverage;
	}

	public static double average(double[] list2) {

		// Variables
		double doubleSum = 0;
		double computeAverage = 0;

		for (int i = 0; i < 10; i++) {
			doubleSum += list2[i];
			// Adds values from array.
		}

		// Calculates and returns average.
		computeAverage = doubleSum / 10;
		return computeAverage;
	}
}
