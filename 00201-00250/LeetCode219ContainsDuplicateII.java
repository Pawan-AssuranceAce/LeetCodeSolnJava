package leetCodeRevisionOne;

import java.util.HashMap;

public class LeetCode219ContainsDuplicateII {
	
	
	public static boolean containsDuplicate(int [] nums, int k)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length;i++)
		{
			if(map.containsKey(nums[i])==true)
			{
				int idx = map.get(nums[i]);
				if((i-idx)<=k)
				{
					return true;
					
				}
				else
				{
					map.put(nums[i],i);
				}
			}
			else
			{
				map.put(nums[i],i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,1};
		int k =3;
		System.out.println(containsDuplicate(nums,k));
	}

}
