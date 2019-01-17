/*
	Chapter 6:	 Traffic Ticket
	Programmer:  Dayla Crabtree
	Class:       Java Programming 1
	Filename:	 Trafic.java
	Purpose:	 This program calculates a traffic ticket and court costs.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Traffic
{
	public static void main(String[] args)
	{
		//declare class variables
		double fine, courtCosts, ticket;
		int speedLimit, offenderSpeed, previousTickets, overLimit;
		System.out.println("       *****Ticket Calculator*****");

		//call methods
				speedLimit = getLimit();
				offenderSpeed = getDriverSpeed();
				if (offenderSpeed <= speedLimit)
				{
					JOptionPane.showMessageDialog(null,"No violation", "Traffic Ticket",JOptionPane.INFORMATION_MESSAGE);
					finish();
				}

		// Calculations
				previousTickets = getTickets();
				overLimit = offenderSpeed - speedLimit;
				fine = overLimit * 20.00;
				courtCosts = getCosts(previousTickets);
				ticket = fine + courtCosts;
				output(fine, courtCosts, ticket);
				finish();
			}

	//The getLimit() method asks the user to input a the speed limit.
	public static int getLimit()
	{
		//declare method variables
		int limit = 0;
		String answer;

		// Prompt
		answer = JOptionPane.showInputDialog(null, "Enter the speed limit: ");

		if (answer == null) finish();

		limit = Integer.parseInt(answer);
		if (limit < 0) {
			JOptionPane.showMessageDialog(null, "Your entry must be greater than 0.","Error",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"No violation", "Traffic Ticket",JOptionPane.INFORMATION_MESSAGE);
			finish();
		}

		return limit;
	}

	//The getDriverSpeed() method asks the user to input the offender's speed.
		public static int getDriverSpeed()
		{
			//declare method variables
			int speed = 0;
			String answer;

			answer = JOptionPane.showInputDialog(null, "Enter the offenders speed: ");

			if (answer == null) finish();

			speed = Integer.parseInt(answer);

			if (speed < 0) {
				JOptionPane.showMessageDialog(null, "Your entry must be greater than 0.","Error",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"No violation", "Traffic Ticket",JOptionPane.INFORMATION_MESSAGE);
				finish();
			}
			return speed;
	}

	//The getTickets() method retrieves number of tickets.
	public static int getTickets()
	{
			//declare method variables
			int tickets = 0;
			String answer;

			answer = JOptionPane.showInputDialog(null, "Enter the number of previous tickets: ");

			if (answer == null) finish();

			tickets = Integer.parseInt(answer);

			if (tickets < 0) {
				JOptionPane.showMessageDialog(null, "Your entry must be greater than 0.","Error",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"No violation", "Traffic Ticket",JOptionPane.INFORMATION_MESSAGE);
				finish();
			}
			return tickets;
	}

	//The getCosts() method returns the court costs.
	public static double getCosts(int tickets)
	{
		double costs = 0.0;

		if (tickets == 0 || tickets == 1) {
			costs = 74.80;
		}

	    if (tickets == 2) {
			costs = 99.80;
		}

        if (tickets >= 3) {
			costs = 124.80;
		}

		return costs;
	}

	//The output() method displays the cost of the ticket.
	public static void output(double dFine, double dCost, double dTicket)
	{
		// Decimal format
		DecimalFormat twoDigits = new DecimalFormat("$#00.00");

		// Output prompt
		JOptionPane.showMessageDialog(null, "Your fine of " + twoDigits.format(dFine) + " plus your court costs of "
		+ twoDigits.format(dCost) + " is " + twoDigits.format(dTicket) + ".");
	}

	//The finish() method ends the program.
	public static void finish()
	{
		System.exit(0);
	}
}