// https://github.com/doocs/leetcode/blob/main/solution/0800-0899/0890.Find%20and%20Replace%20Pattern/README_EN.md
package leetCodeRevisionOne;

import java.util.ArrayList;
import java.util.List;

public class LeetCode890FindandReplacePattern {
	
	public static List<String> findAndReplacePattern(String [] words, String pattern)
	{
		List<String> ans = new ArrayList<>();
		
		for(String word: words)
		{
			if(isMatches(word,pattern))
			{
				ans.add(word);
			}
		}
		return ans;
	}
	
	public static boolean isMatches(String s, String p)
	{
		int[] m1= new int[128];
		int[] m2= new int[128];
		
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			char c2=p.charAt(i);
			
			if(m1[c1]!=m2[c2])
			{
				return false;
			}
			m1[c1]=i+1;
			m2[c2]=i+1;
		}
		return true;
	}

	public static void main(String[] args) {
	 String [] words = {"abc","deq","mee","aqq","dkd","ccc"};
	 String pattern = "abb";
	 
	 List<String> temp= findAndReplacePattern(words,pattern);
	 for(String result : temp)
	 {
		 System.out.println(result);
	 }

	}

}
