package inheritance;

public class CargoShip extends Ship{

	int tonnage;
	
	public CargoShip(String n, String y, int t)
	{
		super(n,y);
		tonnage = t;
	}
	
	public void setTonnage(int t)
	{
		tonnage = t;
	}
	
	public int getTonnage()
	{
		return tonnage;
	}
	
	public String toString()
	{
		return "name: " + name + "\n" + "Cargo capacity: " + tonnage + "ton(s)";
	}
}
