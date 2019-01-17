/*
	Chapter 9:   Objects and classes
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:    CarDemo.java
	Purpose:     Calculates average from 10 integers and doubles.
*/

public class CarDemo {

	/* Fields */
		public static int yearModel = 0;    // Default year
		public static int speed = 0;        // Default speed
		public static String make;          // Default make

	/* Methods */

		// Constructor for Fields
		public CarDemo() {
			this.yearModel = yearModel;
			this.make = make;
			this.speed = speed = 0;
		}

		// Return getYearModel()
		public int getInputModel() {
			return yearModel;
		}

		// Return getMake()
		public String getInputMake() {
			return make;

		}

		// Return getSpeed()
		public int getSpeed() {
			return speed;
		}

		// Adds 5 to speed in accelerate()
		public int accelerate() {
			speed = speed + 5;
			return speed;
		}

		// Subtracts 5 to speed in brake()
		public int brake() {
			speed = speed - 5;
			return speed;
		}
}
