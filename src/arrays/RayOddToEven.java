package arrays;

public class RayOddToEven 
{
	 
	
	public static int go(int[] ray)
	{
		int position = 0;
		int odd = 0;
		int even = 0;
		
		
		while(ray[position] % 2 == 0)
		{
			position ++;
			odd = position;
			if(position == ray.length)
				return -1;
		}
		
		while(ray[position] % 2 == 1)
		{
			position ++;
			even = position;
			if(position == ray.length)
				return -1;
		}
		
			return even - odd;
	}
	
}
