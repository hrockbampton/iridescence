package ifElse;

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	}

	public Social(String soc)
	{
		socialNum = soc;
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
		
		int dash = sub.indexOf("-");
		String integer = sub.substring(0, dash);
		sum = sum + Integer.parseInt(integer);
		sub = sub.substring(dash + 1);
		
		
		
		dash = sub.indexOf("-");
		integer = sub.substring(0, dash);
		sum = sum + Integer.parseInt(integer);
		sub = sub.substring(dash + 1);
		
		
		sum = sum + Integer.parseInt(sub);
		
		
		
		
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
		
	}
	
	public int cleanSum() 
	{
		sum = 0;
		return sum;
	}
	
}

