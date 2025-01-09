//https://www.youtube.com/watch?v=QHKrz0c7E3U
//SC o(1) and TC o(n)

package leetCodeRevisionOne;

public class LeetCode167TwoSumIIInputArrayIsSorted {
	
	public static int [] twoSumInputArray(int [] num, int target)
	{
		int start=0;
		int end=num.length-1;
		while(start<end)
		{
			if(num[start]+num[end]>target)
			{
				end--;
			}
			else if(num[start]+num[end]<target)
			{
				start++;
			}
			else
			{
				return new int[] {start+1,end+1};
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int [] num = {2,7,11,15};
		int target = 9;
		int [] ans = twoSumInputArray(num,target);
		System.out.println(ans[0]+ ","+ ans[1]);

	}

}
