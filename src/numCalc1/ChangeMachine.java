package numCalc1;

import java.util.Scanner;

public class ChangeMachine {

	
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		double itemCost;
		double amountPaid;
		double change;
		double quarters, dimes, nickles, pennies;
		
		System.out.println("Please enter the cost of the item:");
		itemCost = keyboard.nextDouble();

		
		System.out.println("Please enter the amount paid");
		amountPaid = keyboard.nextDouble();

		change = amountPaid - itemCost;
		
		System.out.println("Change Owed: " + change);
		
		quarters = change / .25;
		dimes = ;
		
		System.out.println("Quarters: " + quarters);
	
		System.out.println("Dimes: " + dimes);
	
	
	
	
	
	}
}
