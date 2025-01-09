//https://www.youtube.com/watch?v=0TIUlVdvVJo
package leetCodeRevisionOne;

public class LeetCode238ProductofArrayExceptSelf {
	
	public static int [] productofarray(int [] nums)
	{
		int n=nums.length;
		int [] res = new int[n];
		int productofallbeforeelement =1;
		int productofallafterelement =1;
		for(int i =0; i<n;i++)
		{
			res[i]=productofallbeforeelement;
			productofallbeforeelement = productofallbeforeelement*nums[i];
			
		}
		for(int i=n-1;i>=0;i--)
		{
			res[i]=res[i]*productofallafterelement;
			productofallafterelement=productofallafterelement*nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int [] nums= {1,2,3,4};
		int [] res = productofarray(nums);
		for(int r :res)
		{
			System.out.print(r+", ");
		}
	}

}
