import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode78 
{
	int count = 0;
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, 0);
	    return list;
	}

	private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
//	    	if(i > start && nums[i] == nums[i-1]) continue; // if subset contains duplicate
	        tempList.add(nums[i]);
	        System.out.println(tempList);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
	        System.out.println("---" + tempList);
	    }
	}
}
