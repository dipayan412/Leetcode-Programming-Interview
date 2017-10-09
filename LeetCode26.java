
public class LeetCode26 
{
	int removeDuplicates(int[] nums)
	{
		if(nums == null || nums.length == 0)
		{
			return 0;
		}
		
		int matchCount = 0;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == nums[i + 1])
			{
				matchCount++;
			}
		}
		return (nums.length - matchCount);
	}
}
