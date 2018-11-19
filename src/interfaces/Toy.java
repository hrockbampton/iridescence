package interfaces;

import static java.lang.System.*;

public class Toy implements comparable <Toy>
{
	private String name;
	private int count;

	public Toy()
	{
	}

	public Toy( String nm)
	{
		name = nm; 
		count = 1;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public int compareTo(Toy other) {
	if(this.count)
	
	}
	
	public String toString()
	{
	   return name + "" + count;
	}
}