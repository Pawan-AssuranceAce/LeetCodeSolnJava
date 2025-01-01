//https://www.youtube.com/watch?v=kd0-hUwISDo
package leetCodeRevisionOne;

public class LeetCode918MaximumSumCircularSubarray {
	
	public static int kadanesalgosum(int [] nums)
	{
		int max = Integer.MIN_VALUE;
		int sum =0;
		for(int i =0; i<nums.length;i++)
		{
			sum = sum+nums[i];
			if(sum>max)
			{
				max = sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		}
		return max;
	}
	
	public static int findcircularArrsum(int []nums)
	{
		if(nums.length==0)
		{
			return 0;
		}
		int x = kadanesalgosum(nums);
		int y=0;
		for(int i=0; i<nums.length;i++)
		{
			y = y+nums[i];
			nums[i] = nums[i]*-1;
		}
		int z = kadanesalgosum(nums);
		
		if(y+z==0) //-y(-z) = y+z
		{
			return x;
		}
		return Math.max(x,y+z);
		
	}

	public static void main(String[] args) {

		int [] nums = {1,-2,3,-2};
		System.out.println(findcircularArrsum(nums));

	}

}
