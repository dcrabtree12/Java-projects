/*
 Chapter: 10
 Programmer: Dayla Crabtree
 Class: Java Programming 1
 Filename: BankAcctDemo.java
 Purpose:  Allows user to enter Bank account id, balance, interest rate, and withdraws/deposits.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAcctDemo {
  public static void main (String[] args) {
	  int acctID;
	  double acctBalance, annIntRate, withAmt, depAmt;
	  Scanner input = new Scanner(System.in);
	  DecimalFormat twoDigits = new DecimalFormat("$###,###.00");
	  DecimalFormat percent = new DecimalFormat("##.00%");

	  System.out.println("   Bank Account Balance");
	  System.out.println();

	  System.out.print("Enter your account id: ");
	  acctID = input.nextInt();
	  System.out.println();

	  System.out.print("Enter your current Balance: ");
	  	  acctBalance = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter your annual interest rate: ");
	  	  annIntRate = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter any withdrawals: ");
	  	  	  withAmt = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter any deposits: ");
	  	  	  depAmt = input.nextDouble();
	  System.out.println();


    CheckAcct account = new CheckAcct(acctID, acctBalance);
    CheckAcct.setAnnualInterestRate(annIntRate);

    account.withdraw(withAmt);
    account.deposit(depAmt);
    System.out.println("Balance for account # " +  account.getId() + " is " +twoDigits.format(account.getBalance()));

    System.out.println("Monthly interest is " + twoDigits.format(account.getMonthlyInterest()));

    System.out.println("This account was created at " +
      account.getDateCreated()
     );
      System.out.println();
      System.out.println();

      System.out.println("Annual interest rate is " + percent.format(CheckAcct.getAnnualInterestRate()));


  }
}
