package ifElse;

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare demo = new WordsCompare("abe", "ape");
		System.out.println(demo);
	   
	   demo.setWords("giraffe", "gorilla");
	   System.out.println(demo);
	   
	   demo.setWords("one", "two");
	   System.out.println(demo);
	   
	   demo.setWords("fun", "funny");
	   System.out.println(demo);
	   
	   demo.setWords("123", "19");
	   System.out.println(demo);
	   
	   demo.setWords("193", "1910");
	   System.out.println(demo);
	   
	   demo.setWords("goofy", "godfather");
	   System.out.println(demo);
	   
	   demo.setWords("funnel", "fun");
	   System.out.println(demo);
	  
	}
}