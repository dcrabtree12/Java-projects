import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner Method
		int integer;
		int count = 1;
		int legal = 0;
		int average = 0;

		System.out.println("Enter a positive integer - type a 0 to end: ");
		integer = input.nextInt();

		if (integer < 0) {
					System.out.println("Error - Enter a positive integer - type a 0 to end: ");
					System.exit(0); // Sentinel value for program.
		}

		while (integer > 0) {

			System.out.println("Enter a positive integer - type a 0 to end: ");
		integer = input.nextInt();
			count++;
			legal++;
			average++;
		}
			System.out.println("The total number of legal input: " + legal);
			System.out.println("The average of the input is: " + average);

    }
}
