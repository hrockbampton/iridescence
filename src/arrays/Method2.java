package arrays;

public class Method2 {
	
	
	public int[] addFourty(int[] myArray, int position)//
	{
		int[] newArray = new int[myArray.length + 1];
		for(int i = myArray.length - 1; i >= position; i--)
		{
			newArray[i + 1] = myArray[i];
		}
		
		newArray[position] = 40;
		
		for(int j = 0; j < position; j++) 
		{
			newArray[j] = myArray[j];
		}
		return newArray;
	
	}
	
}


