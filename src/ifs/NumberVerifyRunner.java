package ifs;

import java.util.Scanner;

import static java.lang.System.*;

import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
		
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
		
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
	
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
	
		
		System.out.print("Enter a whole number :: ");
		number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
	
	
	}
}