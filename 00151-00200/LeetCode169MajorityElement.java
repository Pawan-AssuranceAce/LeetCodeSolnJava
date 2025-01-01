package leetCodeRevisionOne;

public class LeetCode169MajorityElement {
	
	public static int majorityElement(int [] nums)
	{
		int count =0;
		int ele =0;
		for(int val : nums)
		{
			if(count==0)
			{
				ele=val;
			}
			if(ele!=val)
			{
				count--;
			}
			else
			{
				count++;
			}
		}
		return ele;
	}

	public static void main(String[] args) {

		int [] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));

	}

}
