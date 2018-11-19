package inheritance;

public class Ship {
	String name;
	String yearBuilt;
	
	public Ship()
	{
		
	}
	
	public Ship(String n, String y) {

		name = n;
		yearBuilt = y;
	}
	
	public void setName(String n)
	{
		name = n;
	}

	public void setYearBuilt(String y )
	{
		yearBuilt = y;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getYearBuilt() 
	{
		return yearBuilt;
	}
	
	public String toString()
	{
		return "Name: " + name + "\n" + "Year built: " + yearBuilt;
	}
}
