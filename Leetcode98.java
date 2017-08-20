class TreeNode 
{
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class LeetCode98 
{
	public boolean isValidBST(TreeNode root) 
    {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean validateBST(TreeNode root, long minVal, long maxVal)
	{
		if(root == null)
		{
			return true;
		}
		if(root.val >= maxVal || root.val <= minVal)
		{
			return false;
		}
		
		return validateBST(root.left, minVal, root.val) && validateBST(root.right, root.val, maxVal);
	}
}
