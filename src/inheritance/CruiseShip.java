package inheritance;

public class CruiseShip extends Ship {
	int passengers;
	
	public CruiseShip(String n, String y, int p)
	{
		super(n,y);
		passengers = p; 
	}
	
	public void setPassengers(int p)
	{
		passengers = p;
	}
	
	public int getPassengers()
	{
		return passengers;
	}
	
	public String toString()
	{
		return "Name: " + super.getName() + "\n" + "Maximum passengers: " + passengers;
	}
}
