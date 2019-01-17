/*
 Chapter: 5
 Programmer: Dayla Crabtree
 Class: Java Programming 1
 Filename: Applets and Swing Components
 Purpose: Calculates monthly cost for using an appliance.
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class KilowattApplet extends Applet implements ActionListener // Interface
{
	DecimalFormat twoDigits = new DecimalFormat("####.00");
	// Variables
	double hourCost, kiloHours, energyCost;

	// Components
	Label appliance = new Label("Welcome to the Appliance Energy Calculator");

		// Label is prompt while field is where information is entered.
		Label costLabel = new Label("Please enter the cost per kilowatt hour:");
		TextField costField = new TextField(10);

		Label hoursLabel = new Label("Please enter the kilowatt hours consumed:");
		TextField hoursField = new TextField(10);

		Button calcButton = new Button("Calculate");

		Label outputLabel = new Label ("Click the calculate button to display the monthly energy cost.");

	public void init()
	{
		// Sets background color and text.
		setBackground(Color.yellow);
		setForeground(Color.red);

		// Adds declared components
		add(appliance);
		add(costLabel);
		add(costField);
		add(hoursLabel);
		add(hoursField);
		add(calcButton);
		calcButton.addActionListener(this);
		add(outputLabel);
	}

	public void actionPerformed(ActionEvent e)
	{
		// Calcuations
		hourCost = Double.parseDouble(costField.getText());
		kiloHours = Double.parseDouble(hoursField.getText());
		energyCost = hourCost * kiloHours;

		// Output
		outputLabel.setText("The monthly cost to operate this appliance is $" + twoDigits.format(energyCost) + ".");
	}
}
