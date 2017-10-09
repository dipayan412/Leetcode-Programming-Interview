public class ArrangingCoins //441
{
	public int arrangeCoins(int n) 
    {
        int sum = 0;
        int i = 0;
        while(i < n)
        {
        	sum += i;
        	if(sum > n)
        		return i-1;
        	i++;
        }
        
        return -1;
    }
}
