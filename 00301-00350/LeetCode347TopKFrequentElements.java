package leetCodeRevisionOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode347TopKFrequentElements {
	
	
	public static int[] kThFrequentElement(int [] nums, int k)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		@SuppressWarnings("unchecked")
		List<Integer> [] bucket = new List[nums.length+1];
		
		for(int i=0; i<nums.length;i++)
		{
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
		}
		
		for(int key: hm.keySet())
		{
			int frequency = hm.get(key);
			if(bucket[frequency]==null)
			{
				bucket[frequency]= new ArrayList<>();
			}
			bucket[frequency].add(key);
		}
		
		int []ans= new int[k];
		int count=0;
		for(int i=bucket.length-1;i>=0;i--)
		{
			if(bucket[i]!=null)
			{
				for(int j=0; j<bucket[i].size();j++)
				{
					ans[count++]= bucket[i].get(j);
				}
			}
			if(count==k)
			{
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,1,1,2,2,3};
		int k=2;
		int [] temp =kThFrequentElement(nums,k);
		for(int a:temp)
		{
			System.out.println(a);
		}

	}

}
