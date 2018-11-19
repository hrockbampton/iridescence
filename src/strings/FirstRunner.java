package strings;

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
	
		System.out.println( "Word :: "+ demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n");
		
		
		demo.setString("World");
		System.out.println( "Word :: "+ demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n");
			
		demo.setString("JukeBox");
		System.out.println( "Word :: "+ demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n");
			
		demo.setString("TCEA");
		System.out.println( "Word :: "+ demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n");
			
		demo.setString("UIL");
		System.out.println( "Word :: "+ demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
			
		
		
		
		
		
		//add more test cases	
		
	}
}