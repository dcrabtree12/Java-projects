/*
 Chapter: 5
 Programmer: Dayla Crabtree
 Class: Java Programming 1
 Filename: integerAmount
 Purpose: Output total number of zeros, positive integers, and negative integers.
*/
import java.util.Scanner;

public class integerAmount {
    public static void main(String[] args) {
		int amount = 0;
		int count = 1;
		int number;
		int zeros = 0;
		int positiveIntegers = 0;
		int negativeIntegers = 0;

		Scanner input = new Scanner(System.in);

    	System.out.println("\t\tPositive and Negative Numbers\n");

		// Outputs prompt while the integer is between 5 and 10.
    	do {
			System.out.println("Enter the total amount of integers to be entered:");
			System.out.print("Must be between 5 and 10: ");
    		amount = input.nextInt();

		} while (amount <= 5 || amount >= 10);

    	for (int i = 1; i <= amount; i++)
    	{

			System.out.print("\nEnter number " + count + ": ");
			number = input.nextInt();

			count++;// Increments

			// Determines if numbers are zeros, positive integers, and negative integers.
			if (number > 0)
				positiveIntegers++;
			else if (number < 0)
				negativeIntegers++;
			if (number == 0)
				zeros++;
		}

		// Outputs total number of zeros, positive integers, and negative integers.
		System.out.println("\nTotal zeros: " + zeros);
		System.out.println("Total positive integers: " + positiveIntegers);
		System.out.println("Total negative integers: " + negativeIntegers);
    }
}