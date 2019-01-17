/*
  Chapter: 1 & 2
  Programmer: Dayla Crabtree
  Class: Java Programming 1
  Filename: arithmetic.java
  Purpose: Displays arithmetic problems with real numbers and integers based on user input.
*/

import java.util.Scanner;

public class arithmetic {
	public static void main(String[]args) {
		int firstInt, secondInt;
		double firstReal, secondReal;
		Scanner input = new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("*  This is my first java Program          *");
		System.out.println("*******************************************");

			System.out.println();// Blank line

		System.out.println("**       Integer arithmetic tests        **");

			System.out.println();// Blank line

		System.out.print("Enter the first integer to test: ");
		firstInt = input.nextInt();

		System.out.print("Enter the second integer to test: ");
		secondInt = input.nextInt();

			System.out.println();// Blank line

		// Outputs entered integers with answer.
		System.out.println(firstInt + " + " + secondInt + " = " + (firstInt + secondInt));
		System.out.println(firstInt + " - " + secondInt + " = " + (firstInt - secondInt));
		System.out.println(firstInt + " * " + secondInt + " = " + (firstInt * secondInt));
		System.out.println(firstInt + " / " + secondInt + " = " + (firstInt / secondInt));
		System.out.println(firstInt + " % " + secondInt + " = " + (firstInt % secondInt));

			System.out.println();// Blank line

		System.out.println("**       Real arithmetic tests           **");

			System.out.println();// Blank line

		System.out.print("Enter the first real to test: ");
	    firstReal = input.nextDouble();

		System.out.print("Enter the second real to test: ");
		secondReal = input.nextDouble();

			System.out.println();// Blank line

		// Outputs entered real numbers with answer.
		System.out.println(firstReal + " + " + secondReal + " = " + (firstReal + secondReal));
		System.out.println(firstReal + " - " + secondReal + " = " + (firstReal - secondReal));
		System.out.println(firstReal + " * " + secondReal + " = " + (firstReal * secondReal));
		System.out.println(firstReal + " / " + secondReal + " = " + (firstReal / secondReal));

			System.out.println();// Blank line
	}
}