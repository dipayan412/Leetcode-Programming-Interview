
public class ReverseWords 
{
	public String reverseWords(String s)
	{
		if(s == null || s.length() == 0)
			return s;
		String res = "";
		int start = -1;
		int end = -1;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ')
			{
				String sub = s.substring(start, end + 1);
				res += reverse(sub) + " ";
				start = end = -1;
			}
			else
			{
				if(start == -1)
				{
					start = i;
					end = i;
				}
				else
				{
					end = i;
				}
				
				if(i == (s.length() - 1))
				{
					res += reverse(s.substring(start, end + 1));
				}
			}
		}
		
		return res;
	}
	
	private String reverse(String s)
	{
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length/2; i++)
		{
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		return String.valueOf(arr);
	}
}
