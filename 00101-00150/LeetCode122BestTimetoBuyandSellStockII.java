package leetCodeRevisionOne;

public class LeetCode122BestTimetoBuyandSellStockII {
	
	public static int bestTimeToBuyandSell(int [] stock)
	{
		int result =0;
		if(stock==null || stock.length==0)
		{
			return 0;
		}
		for(int i=1; i<stock.length;i++)
		{
			if(stock[i]>stock[i-1])
			{
				result += stock[i]-stock[i-1];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int [] stock = {7,1,5,3,6,4};
		System.out.println(bestTimeToBuyandSell(stock));	
	}

}
