package ifs;

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main (String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven demo =new StringOddOrEven();
		
		String input;
		
		System.out.print("Enter a Word :: ");
		input = keyboard.next();
		demo.setString(input);
		System.out.println(demo);
		System.out.println();
		
		System.out.print("Enter a Word :: ");
		input = keyboard.next();
		demo.setString(input);
		System.out.println(demo);
		System.out.println();
		
		System.out.print("Enter a Word :: ");
		input = keyboard.next();
		demo.setString(input);
		System.out.println(demo);
		System.out.println();
		
		System.out.print("Enter a Word :: ");
		input = keyboard.next();
		demo.setString(input);
		System.out.println(demo);
		System.out.println();
	} 
}