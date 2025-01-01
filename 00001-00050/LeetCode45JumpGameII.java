//https://www.youtube.com/watch?v=9kyHYVxL4fw
package leetCodeRevisionOne;

public class LeetCode45JumpGameII {
	
	public static int jumpGameII(int [] num)
	{
		int lastjump =0;
		int totaljumps =0;
		int coverage =0;
		int destination = num.length-1;
		
		if(num.length==1)
		{
			return 0;
		}
		
		for(int i=0;i<num.length;i++)
		{
			coverage = Math.max(coverage, i+num[i]);
			if(i==lastjump)
			{
				lastjump = coverage;
				totaljumps++;
			if(coverage>=destination)
			{
				return totaljumps;
			}
			}
		}
		return totaljumps;
	}

	public static void main(String[] args) {
		int [] num = {2,3,1,1,4};
		System.out.println(jumpGameII(num));
	}

}
