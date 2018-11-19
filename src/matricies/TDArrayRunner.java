package matricies;

import java.util.Arrays;

public class TDArrayRunner {

	public static void main(String[] args) {
		int numRows = 3, numCols = 4;
		int[][] mat = new int[][] { { 10, 9, 8, 7 }, { 6, 5, 4, 3 }, { 2, 1, -1, 0 } };
		double[][] mat2 = new double[][] { { 10.4, 9.5, 8.6, 7.7 }, { 6.4, 5.3, 4.2, 3.1 }, { 2, 1, -1, 0 } };
		int[] vals = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		TDArrayOperations test = new TDArrayOperations();

		// 1
		double one = test.getTotal(mat);
		System.out.println("1: "+one);

		// 2
		double two = test.getAverage(mat2);
		System.out.println("2: " +two);

		// 3
		double three = test.getRowTotal(mat, 1);
		System.out.println("3: " +three);

		// 4
		double four = test.getColumnTotal(mat, 1);
		System.out.println("4: "+four);

		// 5
		double five = test.getHighestInRow(mat, 1);
		System.out.println("5: " +five);

		// 6
		double six = test.getLowestInRow(mat, 1);
		System.out.println("6: " +six);

	}
	
	/*expected results:
		1:54 
		2:4.766666666666667 
		3:18 
		4:15 
		5:6 
		6:3*/

}