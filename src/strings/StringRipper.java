package strings;

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
	}

	public StringRipper(String w)
	{
		word = w;
	}
	
   public void setString(String w)
   {
	   word = w;
   }	

	public String ripString(int x, int y)
	{
		 
		
		return word.substring(x,y);
	}

 	public String toString()
 	{
 		return word+ "\n\n";
	}
}