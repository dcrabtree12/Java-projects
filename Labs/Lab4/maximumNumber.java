/*
 Chapter: 5
 Programmer: Dayla Crabtree
 Class: Java Programming 1
 Filename: maximumNumber
 Purpose: Output the maximum number and its count.
*/
import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner Method

		// Variables
		int enterInt;
		int max = 0;
		int count = 0;

		System.out.println("\t\tFind the maximum number\n"); // Title for program

		System.out.print("Enter an integer (0 ends the input): "); // Prompt for user to enter integer.
		enterInt = input.nextInt();

		if (enterInt == 0) { // If 0 is entered first the program will show this prompt.
			System.out.println("No numbers are entered except 0.");
			System.exit(0); // Sentinel value for program.
		}

		while (enterInt != 0 || enterInt > max) {

			if (enterInt > max) {
				max = enterInt; // If the number is greater than max, assign it to max and reset count to 1.
				count = 1; // Resets count.  Could also be reset to 0.
			}

			if (enterInt == max) {
				count++; // If the number is equal to max, increment count by 1.)
				// System.out.println("Count: " + count); // This line will show the count increase
			}

			System.out.print("Enter an integer (0 ends the input): ");
				enterInt = input.nextInt();

		}

	    // The program will prompt the max number and number of times it occurs.

		  	System.out.println("The maximum number is " + max);
		  	System.out.println("The count for the max number is " + (count - 1));

	    // if count is reset to 0, there would be no need to subtract the count for the printed line.
	}
}