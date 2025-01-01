//https://www.youtube.com/watch?v=k4DmoFFLArs
package leetCodeRevisionOne;

public class LeetCode242ValidAnagram {
	
	public static boolean validAnagram(String str1, String str2)
	{
		int [] count = new int[26];
		if(str1.length()!=str2.length())
		{
			return false;
		}
		for(char ch1 : str1.toCharArray())
		{
			count[ch1-'a']++;
		}
		for(char ch2 : str2.toCharArray())
		{
			count[ch2-'a']--;
		}
		for(int val:count)
		{
			if(val!=0)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str1="anagram";
		String str2="nagaram";
		System.out.println(validAnagram(str1,str2));
	}

}
