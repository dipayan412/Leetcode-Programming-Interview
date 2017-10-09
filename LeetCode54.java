import java.util.ArrayList;

public class LeetCode54 
{	
	ArrayList<Integer> spiralMatrix(int[][] matrix)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0)
		{
			return result;
		}
		
		int m = matrix.length; 		// nums of row
		int n = matrix[0].length;	// nums of col
		int x = 0; // row counter
		int y = 0; // col counter
		
		while(m > 0 && n > 0)
		{
			if(m == 1)
			{
				for(int i = 0; i < n; i++)
				{
					result.add(matrix[x][y++]);
				}
				break;
			}
			else if(n == 1)
			{
				for(int i = 0; i < m; i++)
				{
					result.add(matrix[x++][y]);
				}
				break;
			}
			
			//top-left -> top-right
			for(int i = 0; i < n - 1; i++)
			{
				result.add(matrix[x][y++]);
			}
			
			//top-right -> bottom-right
			for(int i = 0; i < m - 1; i++)
			{
				result.add(matrix[x++][y]);
			}
			
			//bottom-right -> bottom-left
			for(int i = 0; i < n - 1; i++)
			{
				result.add(matrix[x][y--]);
			}
			
			//bottom-left -> top-left
			for(int i = 0; i < m - 1; i++)
			{
				result.add(matrix[x--][y]);
			}
			
			x++;
			y++;
			m = m - 2;
			n = n - 2;
		}
		
		return result;
	}
}


