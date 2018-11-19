package ifElse;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality demo = new StringEquality("hello", "goodbye");
		System.out.println(demo);
		
		demo.setWords("one", "two");		
		System.out.println(demo);
		
		demo.setWords("three", "four");		
		System.out.println(demo);
		
		demo.setWords("TCEA", "UIL");		
		System.out.println(demo);
		
		demo.setWords("State", "Champions");		
		System.out.println(demo);
		
		demo.setWords("ABC", "ABC");		
		System.out.println(demo);
		
		demo.setWords("ABC", "CBA");		
		System.out.println(demo);
		
		demo.setWords("Same", "Same");		
		System.out.println(demo);
	}
}