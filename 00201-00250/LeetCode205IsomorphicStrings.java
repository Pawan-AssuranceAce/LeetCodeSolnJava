//https://www.youtube.com/watch?v=9QOMqJ4j5aE
package leetCodeRevisionOne;

import java.util.HashMap;

public class LeetCode205IsomorphicStrings {
	
	public static boolean isomorphicString(String s1,String s2)
	{
	HashMap<Character,Character> mp1 = new HashMap<>();
	HashMap<Character,Boolean> mp2 = new HashMap<>();
	  
	if(s1.length()!=s2.length())
	{
		return false;
	}
	 int n = s1.length();
	 for(int i=0;i<n;i++)
	 {
		 char ch1 = s1.charAt(i);
		 char ch2 = s2.charAt(i);
		 if(mp1.containsKey(ch1)==true)
		 {
			 if(mp1.get(ch1)!=ch2)
				{
					return false;
				}
		 }
		 else
		 {
			 if(mp2.containsKey(ch2)==true)
			 {
				 return false;
			 }
			 else
			 {
			 mp1.put(ch1, ch2);
			 mp2.put(ch2, true);
			 }
		 }
	 }
	 return true;
	}


	public static void main(String[] args) {
		
		String s1 = "eggg";
		String s2 ="addd";
		System.out.println(isomorphicString(s1,s2));
	}

}
