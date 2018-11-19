package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int sum = 0;
		for(int num : ray)
			sum += num;
			
		return sum;
	}
}
