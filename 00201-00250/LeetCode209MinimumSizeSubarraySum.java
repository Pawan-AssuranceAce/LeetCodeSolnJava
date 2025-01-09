//https://www.youtube.com/watch?v=xBZfV0OBmLY
package leetCodeRevisionOne;

public class LeetCode209MinimumSizeSubarraySum {
	
	public static int minimumSizeSubarraySum(int[] num, int target)
	{
		int n = num.length;
		int left =0;
		int subarrsize = n+1;
		int windowvalueadd = 0;
		for(int right=0; right<n;right++)
		{
			windowvalueadd+=num[right];
			while(windowvalueadd>=target)
			{
				subarrsize = Math.min(subarrsize, right-left+1);
				windowvalueadd-=num[left++];
			}
		}
		return subarrsize == n+1 ? 0 : subarrsize;
	}

	public static void main(String[] args) {
		int [] num = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(minimumSizeSubarraySum(num,target));
		

	}

}
