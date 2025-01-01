//https://www.youtube.com/watch?v=ZOLCI-liNb0
package leetCodeRevisionOne;

import java.util.HashSet;
import java.util.Set;


public class LeetCode202HappyNumber {
	
	public static boolean happyNumber(int n)
	{
		Set<Integer> set = new HashSet<>();
		while(n!=1 && !set.contains(n)) {
			set.add(n);
			int sum =0;
			while(n>0)
			{
				sum+=Math.pow((n%10),2);
				n = n/10;
			}
			
			n=sum;
		}
		
		return n==1;
	}

	public static void main(String[] args) {
		int n = 19;
		System.out.println(happyNumber(n));

	}

}
