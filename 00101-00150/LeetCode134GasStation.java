package leetCodeRevisionOne;

public class LeetCode134GasStation {
	
	public static int gasStation(int [] gas, int[] cost)
	{
		int currentcost =0;
		int start =0;
		int totalgas =0;
		int totalcost=0;
		for(int i =0;i<gas.length;i++)
		{
			totalgas+=gas[i];
		}
		for(int j=0;j<cost.length;j++)
		{
			totalcost+=cost[j];
		}
		if(totalgas<totalcost)
		{
			return -1;
		}
		for(int k=0; k<gas.length;k++)
		{
			currentcost += gas[k]-cost[k];
			if(currentcost<0)
			{
				start=k+1;
				currentcost =0;	
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int [] gas = {1,2,3,4,5};
		int [] cost = {3,4,5,1,2};
		System.out.println(gasStation(gas,cost));
	}

}
