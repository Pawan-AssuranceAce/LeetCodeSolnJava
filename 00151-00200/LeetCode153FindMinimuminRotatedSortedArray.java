package leetCodeRevisionOne;

public class LeetCode153FindMinimuminRotatedSortedArray {
	
	public static int findMinimumRotatedSortedArray(int [] nums)
	{
		int left = 0;
		int right = nums.length-1;
		while(left<right)
		{
			int mid = left+(right-left)/2;
			if(nums[mid]>nums[right])
			{
				left = mid+1;
			}
			else
			{
				right = mid;
			}
		}
		return nums[right];
	}
	

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(findMinimumRotatedSortedArray(nums));
		
	}

}
