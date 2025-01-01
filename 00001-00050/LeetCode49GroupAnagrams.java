package leetCodeRevisionOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode49GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String [] str)
	{
		HashMap<String,List> map = new HashMap();
		for(String s : str)
		{
			int [] count = new int[26];
			for(char ch : s.toCharArray())
			{
				count[ch-'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for(int i : count)
			{
				sb.append("#");
				sb.append(i);
			}
			String key = sb.toString();
			if(!map.containsKey(key))
			{
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(s);
		}
		return new ArrayList(map.values());
	}

	public static void main(String[] args) {
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> res = groupAnagrams(str);
		System.out.println(res);
		

	}

}
