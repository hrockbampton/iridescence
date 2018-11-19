package strings;

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	
	public FirstAndLast(String w)
	{
		word = w;
		
	}

	public void setString(String w)
	{
		word = w;
	}

	public String getFirst()
	{
		return word.substring(0,1);
	}
	
	public String getLast()
	{
		return word.substring(word.length()-1);
	}

 	public String toString()
 	{
 		String output= word ;
 		return output;
	}
}