package strings;

import static java.lang.System.*;

public class AddStrings {//import static java.lang.System.*;



   private String first, last;
   private String sum;

   

   public AddStrings(String one, String two)
   {
  first = one;
  last = two;
   
   }

   public void setStrings(String one, String two)
   {
	   
	   first = one;
	   last = two;
   }

 	public void add()
 	{
 		sum = first + " "+ last;
	}

 	
 	public String toString()
 	{
 		String output = "";
 		output= "first :: " + first + "\n" + "last :: " + last + "\n" + "sum :: " + sum + "\n\n";
 		
 				return output;
 		
	}

}
