package arrays;

public class RaySumLast {
	
	public static int go(int[] ray){
		int sum = 0;
		for(int i = 0; i < ray.length - 1; i++){
			if(ray[i] > ray[ray.length - 1])
			sum += ray[i];
		}
		if(sum == 0)
			return -1;
		else 
			return sum;
	}
}


