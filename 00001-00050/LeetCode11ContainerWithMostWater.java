package leetCodeRevisionOne;

public class LeetCode11ContainerWithMostWater {
	
	public static int containerWithMostWater(int [] height)
	{
		int l=0;
		int r=height.length-1;
		int max=0;
		
		while(l<r)
		{
			int lh=height[l];
			int rh=height[r];
			int minh = Math.min(lh, rh);
			int len = r-l;
			int curr_area = len*minh;
			max=Math.max(max, curr_area);
			if(lh<rh)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(containerWithMostWater(height));
	}

}
