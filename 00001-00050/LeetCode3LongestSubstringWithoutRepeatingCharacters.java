package leetCodeRevisionOne;

import java.util.HashSet;

public class LeetCode3LongestSubstringWithoutRepeatingCharacters {
	
	public static int longestSubstringWithoutRepeatingchar(String s)
	{
		HashSet<Character> wchar = new HashSet<>();
		int left = 0;
		int right =0;
		int max = 0;
		
		while(right<s.length())
		{
			char c = s.charAt(right);
			if(wchar.add(c))
			{
				max = Math.max(max, (right-left+1));
				right++;
			}
			else
			{
				while(s.charAt(left)!=c)
				{
					wchar.remove(s.charAt(left));
					left++;
				}
				wchar.remove(c);
				left++;
			}
		}
		return max;
	}
	

	public static void main(String[] args) {
		String s ="abcabcbb";
		System.out.println(longestSubstringWithoutRepeatingchar(s));
	}

}
