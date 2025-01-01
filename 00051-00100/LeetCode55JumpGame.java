package leetCodeRevisionOne;

public class LeetCode55JumpGame {
	
	public static boolean jumpGame(int [] num)
	{
		int finalPosition = num.length-1;
		
		for(int indx=num.length-2;indx>=0;indx--)
		{
			if(indx+num[indx]>=finalPosition)
			{
				finalPosition = indx;
			}
		}
		
		return finalPosition==0;
	}

	public static void main(String[] args) {
		int [] num = {2,3,1,1,4};
		System.out.println(jumpGame(num));
	}

}
