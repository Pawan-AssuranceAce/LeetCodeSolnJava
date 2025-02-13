// https://www.youtube.com/watch?v=M4pfB3G-YQc
package leetCodeRevisionOne;


import java.util.Arrays;

public class LeetCode516LongestPalindromicSubsequence {
	
	int [] [] t=new int[1001][1001];
	
	public  int lps(String s, int i,int j)
	{
		if(i>j)
		{
			return 0;
		}
		if(i==j)
		{
			return 1;
		}
		if(t[i][j]!=-1)
		{
			return t[i][j];
		}
		if(s.charAt(i)==s.charAt(j))
		{
			return t[i][j]= 2+lps(s, i+1,j-1);
		}
		else
		{
			return t[i][j]= Math.max(lps(s, i+1,j), lps(s,i,j-1));
		}
	}
	
	public int longtestPalindromeSubseq(String s)
	{
		int m = s.length();
		for(int[] row:t)
		{
			Arrays.fill(row,-1);
		}
		return lps(s,0,m-1);
	}

	public static void main(String[] args) {
		String s="bbbab";
		LeetCode516LongestPalindromicSubsequence lp = new LeetCode516LongestPalindromicSubsequence();
		System.out.println(lp.longtestPalindromeSubseq(s));

	}

}
