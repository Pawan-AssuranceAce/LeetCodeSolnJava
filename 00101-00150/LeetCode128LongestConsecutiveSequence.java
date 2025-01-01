package leetCodeRevisionOne;

import java.util.HashMap;

public class LeetCode128LongestConsecutiveSequence {
	
	public static int longestConsectiveSequence(int [] nums)
	{
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i =0; i<nums.length;i++)
		{
			map.put(nums[i], true);
		}
		
		for(int j=0;j<nums.length;j++)
		{
			if(map.containsKey(nums[j]-1))
			{
				map.put(nums[j], false);
			}
		}
		int max=0;
		for(Integer key : map.keySet())
		{
			if(map.get(key)==true)
			{
			max = Math.max(max, findlength(map,key));
			}
		}
		return max;
	}
	
	public static int findlength(HashMap<Integer,Boolean> map,int key)
	{
		int ans=0;
		while(map.containsKey(key))
		{
			ans++;
			key++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int [] nums = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsectiveSequence(nums));
	}

}
