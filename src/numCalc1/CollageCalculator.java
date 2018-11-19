package numCalc1;

import java.util.Scanner;

public class CollageCalculator {
	
	
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
	
		int food;
		int dormRent;
		int books;
		int tuition;
		int supplies;
		int laundry;
		int phoneBill;
		int gas;
		int collegeExpense;
		
		
		System.out.println("How much would food cost?");
		food = keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much is rent for a dorm?");
		dormRent = keyboard.nextInt();
		System.out.println();
		
		System.out.println("What is the cost for books?");
		books = keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much is your tuition?");
		tuition = keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much are your schhol supplies?");
		supplies = keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much does it cost to wash your laundry?");
		laundry = keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much is your phone bill?");
		phoneBill = keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much does gas cost?");
		gas = keyboard.nextInt();
		System.out.println();
		
		collegeExpense = food + dormRent + books + tuition + supplies + laundry + phoneBill + gas;
	
		System.out.println("your expense for collage is: " + collegeExpense);
	
	
	
	
	
	}
	
	

}

