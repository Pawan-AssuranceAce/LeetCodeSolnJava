//https://www.youtube.com/watch?v=AHZpyENo7k4
package leetCodeRevisionOne;

public class LeetCode53MaximumSubarray {
	
	public static int maximumSubarray(int [] num)
	{
		int maxi = Integer.MIN_VALUE;
		int sum =0;
		for(int i=0; i<num.length;i++)
		{
			sum = sum+num[i];
			if(sum>maxi)
			{
				maxi = sum;
			}
			if(sum<0)
			{
				sum =0;
			}
				
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		int [] num = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSubarray(num));

	}

}
