/*
	Chapter 9:   Objects and classes
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:    CheckAcct.java
	Purpose:     Calculates bank account balance.
*/

public class CheckAcct {

	/* Fields */

		private int id;
		private double balance;
		private static double annualInterestRate; // Stores current interest rate.
		private java.util.Date dateCreated; // Stores date account was created.

	/* Constructor */

		public CheckAcct(int id, double balance) {
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
			dateCreated = new java.util.Date();
		}

	/* Accessor Methods */

		public int getId() {
			return id;
		}

		public double getBalance() {
			return balance;
		}

		public static double getAnnualInterestRate() {
			return annualInterestRate;
		}

	/* Mutator Method */

		public static void setAnnualInterestRate(double annIntRate) {
		    annualInterestRate = annIntRate;
        }

	/* Accessor Method */

		public String getDateCreated() {
		    return this.dateCreated.toString();
    	}

	/* Methods */

		public double getMonthlyInterestRate() {
		     return (annualInterestRate) / 12 ;
		}

		// Calculates the monthly interest rate with getMonthlyInterestRate() Method.
		public double getMonthlyInterest() {
		     return balance * getMonthlyInterestRate();
    	}

		public void withdraw(double withAmt) { // withdraws a specified amount from the account.

			this.balance -= withAmt;
		}

		public void deposit(double deptAmt) { // deposits a specified amount from the account.

			this.balance += deptAmt;
		}

}