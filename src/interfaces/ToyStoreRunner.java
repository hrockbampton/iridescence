package interfaces;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner {
	public static void main(String args[]) {

		ToyStore t = new ToyStore();
		Scanner scan = new Scanner(System.in);
		System.out.println("How many toys in total?");
		int num = scan.nextInt();
		int count = 1;
		for (int i = 0; i < num; i++) {
			System.out.println("Enter name of toy number " + count);
			String name = scan.next();
			count++;
			System.out.println("How many of that toy? ");
			int toyNum = scan.nextInt();
			t.loadToys(name, toyNum);

		}
		System.out.print("Here is your unsorted toy list: ");
		System.out.println(t);

		System.out.print("The most frequent toy is: ");
		System.out.println(t.getMostFrequentToy());
		
		System.out.print("here is your sorted list: ");
		t.sortToysWithSelectionSort();
		System.out.println(t);
		

	}
}