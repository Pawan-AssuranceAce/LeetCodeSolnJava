package leetCodeRevisionOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15ThreeSum {
	
	List<List<Integer>> res = new ArrayList();
	
	public  List<List<Integer>> threesum(int [] num)
	{
		Arrays.sort(num);
		for(int i=0; i<num.length; i++)
		{
			if(i==0 || num[i-1]!=num[i])
			{
				twoSortedSum(i+1, num.length-1, num, 0-num[i]);
			}
		}
		return res;
	}
	
	 void twoSortedSum(int i, int j, int [] num, int target)
	{
		int a1 = num[i-1];
		while(i<j)
		{
			if(num[i]+num[j]>target)
			{
				j--;
			}
			else if(num[i]+num[j]<target)
			{
				i++;
			}
			else
			{
				List<Integer> list = new ArrayList();
				list.add(a1);
				list.add(num[i]);
				list.add(num[j]);
				res.add(list);
				
				while(i<j && num[i]==num[i+1])
				{
					i++;
				}
				while(i<j && num[j]==num[j-1])
				{
					j++;
				}
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int [] num = {-1,0,1,2,-1,-4};
		LeetCode15ThreeSum lts = new LeetCode15ThreeSum();
		List<List<Integer>> temp = new ArrayList();
		temp = lts.threesum(num);
		for(int i=0; i<temp.size();i++)
		{
			System.out.print(temp.get(i));
		}
		

	}

}
