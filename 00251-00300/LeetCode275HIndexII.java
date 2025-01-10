//https://www.youtube.com/watch?v=fVAR6SiATgI
//Soln 2 https://www.youtube.com/watch?v=QWrGZ9Eq2I8
package leetCodeRevisionOne;

public class LeetCode275HIndexII {
	
	public static int hIndexII(int [] citations)
	{
		int [] bucket = new int[citations.length+1];
		for(int i=0;i<citations.length;i++)
		{
			if(citations[i]>citations.length)
			{
				bucket[citations.length]++;
			}
			else
			{
				bucket[citations[i]]++;
			}
		}
		int count=0;
		for(int i=bucket.length-1;i>=0;i--)
		{
			count +=bucket[i];
			if(count>=i)
			{
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
	int [] citations = {0,1,3,5,6};
	System.out.println(hIndexII(citations));

	}

}
