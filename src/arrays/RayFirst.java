package arrays;

public class RayFirst {
	
	public static boolean go(int[] ray)
	{
		for(int i = 1 ; i < ray.length; i++)
			if(ray[i] == ray[0])
				return true;
		return false;
	}
}
