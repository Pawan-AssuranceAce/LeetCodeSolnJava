package leetCodeRevisionOne;

import java.util.HashMap;

public class LeetCode1TwoSum {
	
	public static int [] twoSum(int[] nums, int target)
	{
		HashMap<Integer,Integer> mp = new HashMap<>();
		int n = nums.length;
		for(int i=0; i<n;i++)
		{
			int curr = nums[i];
			int x = target-curr;
			if(mp.containsKey(x)==true)
			{
				return new int [] {mp.get(x),i};
			}
			else
			{
				mp.put(curr,i);
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int [] nums = {2,7,11,15};
		int target = 9;
		for(int i : twoSum(nums,target))
		{
			System.out.println(i);
		}

	}

}
