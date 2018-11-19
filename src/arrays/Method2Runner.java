package arrays;

import java.util.Arrays;

public class Method2Runner {
	
	public static void main( String args[] )
	{
		Method2 demo = new Method2();
		int[] ray = {0, 10, 20, 30, 40, 50, 60, 70};
		int x = 7;
		
		System.out.print(Arrays.toString(demo.addFourty(ray, x)));
	}
	
}
