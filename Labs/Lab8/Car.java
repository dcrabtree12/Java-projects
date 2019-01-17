/*
	Chapter 9:   Objects and classes
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:    Car.java
	Purpose:
*/

import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		/* Scanner Method */
		Scanner input = new Scanner(System.in);

		// Class CarDemo
		CarDemo car = new CarDemo();

		/* Title */
		System.out.println("\tDemonstration of Car Class\n");

		// Prompt for car make.
		System.out.print("Enter the make of the car: ");
		car.make = input.nextLine();

		// "".equals(car.make) is a object class seeing if "" is equal to what the user inputs to continue the condition.
	 		while ("".equals(car.make)) {
				System.out.println("\nInput error - enter a car make");

				System.out.print("Enter the make of the car: ");
				car.make = input.nextLine();
			}

		System.out.print("\nEnter the year of the car: ");
		car.yearModel = input.nextInt();

		// Prompt for year model.
			while (car.yearModel <= 1940  || car.yearModel >= 2016) {
				System.out.println("\nInput error - enter a year between 1940 and 2016.");

				System.out.print("Enter the year of the car: ");
				car.yearModel = input.nextInt();
			}

		System.out.println("\ndemo car");
		System.out.println("     Model Year: " + car.getInputModel());
		System.out.println("     Make      : " + car.getInputMake());
		System.out.println("     Speed     : " + car.getSpeed());

		/* Title for speed up */
		System.out.println("\nSPEED UP!\n");

		// Outputs speed 5 times of car during acceleration().
			for (int i = 1; i <= 5; i++) {

				System.out.println("demoCar's speed: " + car.accelerate());
			}

		/* Title for slow down */
		System.out.println("\nSlow down!\n");

		// Outputs speed 5 times of car during brake().
			for (int i = 1; i <= 5; i++) {

				System.out.println("demoCar's speed: " + car.brake());
			}

		/* End of road */
		System.out.println("\nEnd of the Road for Car Class Demonstration");

	}
}
