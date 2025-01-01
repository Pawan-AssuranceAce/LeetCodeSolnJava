package leetCodeRevisionOne;

import java.util.HashMap;

public class LeetCode290WordPattern {
	
	public static boolean wordPattern(String pattern, String s)
	{
		String [] str = s.trim().split(" ");
		if(pattern.length()!=str.length)
		{
			return false;
		}
		
		HashMap<Character,String> map1 = new HashMap<>();
		HashMap<String,Boolean> map2 = new HashMap<>();
		
		int n = pattern.length();
		for(int i=0;i<n;i++)
		{
			char ch = pattern.charAt(i);
			String word = str[i];
			if(map1.containsKey(ch)==true)
			{
				if(!map1.get(ch).equals(word))
				{
					return false;
				}
			}
			else
			{
				if(map2.containsKey(word)==true)
				{
					return false;
				}
				else
				{
					map1.put(ch,word);
					map2.put(word,true);
				}
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String pattern = "abba";
		String s="dog cat cat dog";
		System.out.println(wordPattern(pattern,s));

	}

}
