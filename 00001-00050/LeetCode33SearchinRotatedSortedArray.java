////https://www.youtube.com/watch?v=7lPuZdCJNBE
package leetCodeRevisionOne;

public class LeetCode33SearchinRotatedSortedArray {
	
	public static int searchInRotatedSortedArray(int [] num, int target)
	{
		int left = 0;
		int right = num.length-1;
		
		while(left<=right)
		{
			int mid = left+(right-left)/2;
			if(num[mid]==target)
			{
				return mid;
			}
			if(num[left]<=num[mid])
			{
				if(num[left]<=target && num[mid]>=target)
				{
					right = mid-1;
				}
				else
				{
					left = mid+1;
				}
			}
			else
			{
				if(num[mid]<=target && target<=num[right])
				{
					left = mid+1;
				}
				else
				{
					right = mid-1;
				}
			}
				
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] num = {4,5,6,7,0,1,2};
		int target = 0 ;
		System.out.println(searchInRotatedSortedArray(num,target));
	}

}
