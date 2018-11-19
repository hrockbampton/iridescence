package dataTypes;

import static java.lang.System.*;

import java.util.Scanner;

public class BirthdayGame {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int originalNum;
		int subtractedNum;
		int birthMonth;
		int birthDay;

		System.out.println("Using paper and pencil, perform the following calculations:");
		System.out.println();
		System.out.println("1. Determine your birth month (January=1, Febuary=2 and so on).");
		System.out.println("2. Multiply tht number by 5.");
		System.out.println("3. Add 6 to that number.");
		System.out.println("4. Multiply the number by 4.");
		System.out.println("5. Add 9 to the number.");
		System.out.println("6. Multiply that number by 5.");
		System.out.println("Add your birth day to the number (10 if the 10th and so on).");
		System.out.println("");

		System.out.println("Enter your number: ");

		originalNum = keyboard.nextInt();

		subtractedNum = (originalNum - 165);

		birthMonth = (subtractedNum / 100);

		birthDay = (subtractedNum % 100);

		System.out.println("your birthday is:" + birthMonth + "/" + birthDay);

	}
}