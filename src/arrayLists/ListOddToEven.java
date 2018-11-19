package arrayLists;

	import java.util.ArrayList;
	import java.util.List;

	public class ListOddToEven
	{
		public static int go( List<Integer> ray )
		{
			int odd = 0;
			int even = 0;
			
			for(int i = 0; i < ray.size(); i++){
				if(ray.get(i) % 2 == 1){
					odd = i;
					for(int j = ray.size() -  1; j > odd; j--){
						if(ray.get(j) % 2 == 0){
							even = j;
							return even - odd;
								
						}		
					}
				}
			}
		return -1;
		}
	}