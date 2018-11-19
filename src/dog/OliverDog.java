package dog;

public class OliverDog implements Dog {

	private String oName;
	private String dName;
	private String bark;
	

	public OliverDog(String onm, String dnm, String b) {
		oName=onm;
		dName=dnm;
		bark=b;

	}

	
	public String getOwnerName(){
		return oName = getOwnerName();
		
	}

	public String getDogName(){
		return dName = getDogName();
	}

	public String getBark(){
		return bark = getBark();
	}




	public String toString() {
		return oName + "'s dog "+dName +" says "+ bark;
	}
}