import java.util.Arrays;

public class RotateArray 
{
	public void rotateArray(int[] nums, int k)
	{
		reverse(nums, 0, k);
		reverse(nums, k + 1, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
		
		System.out.println(Arrays.toString(nums));
	}
	
	void reverse(int[] nums, int i, int j)
	{
		while(i < j)
		{
			int temp = nums[i];
			nums[i++] = nums[j];
			nums[j--] = temp;
		}
	}
}
