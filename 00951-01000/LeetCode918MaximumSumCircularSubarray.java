//https://www.youtube.com/watch?v=kd0-hUwISDo
package leetCodeRevisionOne;

import java.sql.Array;
import java.util.Scanner;

public class LeetCode918MaximumSumCircularSubarray {
	
	public static int kadaneAlgoFindSum(int [] nums)
	{
		int max = Integer.MIN_VALUE;
		int sum =0;
		for(int i=0; i<nums.length; i++)
		{
			sum+= nums[i];
			if(sum>max)
			{
				max=sum;
			}
			if(sum<0)
			{
				sum =0;
			}
		}
		return max;
	}
	
	public static int maxSumCircularSubarry(int [] nums)
	{
		if(nums.length==0)
		{
			return 0;
		}
		int x = kadaneAlgoFindSum(nums);//finding the normal kadane sum
		int y=0;
		for(int i=0; i<nums.length;i++)
		{
			y +=nums[i];
			nums[i]=nums[i]*-1;
		}
		int z = kadaneAlgoFindSum(nums); // pass the coverted line 34 to find the max value
		if(y+z==0) //y-(-z) is y+z
        {
            return x;
        } 
		return Math.max(x,y+z);
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scn.nextInt();
		int [] nums = new int[size];
		System.out.println("Enter the values of array: ");
		for(int i = 0; i<size;i++)
		{
			nums[i]=scn.nextInt();
		}
		System.out.println(maxSumCircularSubarry(nums));

	}

}
