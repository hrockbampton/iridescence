package numCalc1;

import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);

		int test1, test2;
		int quiz1, quiz2, quiz3;
		double homework;
		double testAvg, quizAvg, finalGrade;
		
		System.out.println("Please enter your test grades.");
		
		System.out.print("Test 1: ");
		test1 = keyboard.nextInt();
		
		System.out.print("Test 2: ");
		test2 = keyboard.nextInt();
		System.out.println();

		
		System.out.println("Please enter your quiz grades.");
		
		System.out.print("quiz 1: ");
		quiz1 = keyboard.nextInt();
		
		System.out.print("quiz 2: ");
		quiz2 = keyboard.nextInt();
		
		System.out.print("quiz 3: ");
		quiz3 = keyboard.nextInt();
		System.out.println();
		
		
		System.out.println("Please enter your Homework average.");
		System.out.print("Homework: ");
		homework = keyboard.nextDouble();
		System.out.println();
		
		testAvg = (test1 + test2)/2;
		quizAvg = (quiz1 + quiz2 + quiz3)/3;
		finalGrade = testAvg * 0.5 + quizAvg * 0.3 + homework * 0.2;
		
		System.out.println("Test Average: " + testAvg);
		System.out.println("Quiz Average: " + quizAvg);
		System.out.println("Final Grade: " + finalGrade);
		
		
		








	}
}
