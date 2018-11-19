package matricies;

public class TDArrayOperations {

	public TDArrayOperations()
	{
		
	}
	
	public int getTotal(int[][] grid)
	{
		int sum = 0;
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				sum += grid[i][j];
			}
		}
		return sum;
	}
	
	public double getAverage(double[][] grid)
	{
		double sum = 0;
		double quantity = 0;
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				sum += grid[i][j];
				quantity ++;
			}
		}
		return sum / quantity;
	}
	
	public int getRowTotal(int[][] grid, int row)
	{
		int total = 0;
		
		for(int i = 0; i < grid[row].length; i++) {
			total += grid[row][i];
		}
		return total;
	}
	
	public int getColumnTotal(int[][] grid, int col) 
	{
		int total = 0;
		
		for(int i = 0; i < grid.length; i++) {
			total += grid[i][col];
		}
		return total;
	}
	
	 public int getHighestInRow(int[][] grid, int row) 
	 {
		int high = grid[row][0];
		
		for(int i = 1; i < grid[row].length; i++) {
			if(high < grid[row][i]) {
				high = grid[row][i];
			}
		}
		return high;  
	 }
	 
	 public int getLowestInRow(int[][] grid, int row)
	 {
		int low = grid[row][0];
		
		 for(int i = 1; i < grid[row].length; i++) {
			if(low > grid[row][i]) {
				low = grid[row][i];
			}
		 }
		 return low;
	 }
	
}
