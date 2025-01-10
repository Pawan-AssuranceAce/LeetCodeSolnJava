//https://www.youtube.com/watch?v=gVUrDV4tZfY
package leetCodeRevisionOne;

import java.util.Scanner;

public class LeetCode371SumofTwoIntegers {

	public static int sumofTwoIntegers(int a,int b)
	{
		while(b!=0)
		{
			int temp=(a&b)<<1;
			a=(a^b);
			b=temp;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = scn.nextInt();
		System.out.println("Enter the value of b:");
		int b = scn.nextInt();
		System.out.println(sumofTwoIntegers(a,b));

	}

}
