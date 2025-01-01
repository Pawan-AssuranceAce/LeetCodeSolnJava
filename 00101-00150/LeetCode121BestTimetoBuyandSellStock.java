package leetCodeRevisionOne;

public class LeetCode121BestTimetoBuyandSellStock {
	
	public static int maxprofit(int[] prices)
	{
		int minprice = Integer.MAX_VALUE;
		int maxprofit =0;
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]<minprice)
			{
				minprice = prices[i];
			}
			else if(prices[i]-minprice>maxprofit)
			{
				maxprofit = prices[i]-minprice;
			}
		}
			return maxprofit;
	}

	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		int temp = maxprofit(prices);
		System.out.println(temp);

	}

}
