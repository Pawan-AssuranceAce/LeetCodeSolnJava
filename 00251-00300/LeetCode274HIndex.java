//https://www.youtube.com/watch?v=fVAR6SiATgI
package leetCodeRevisionOne;

public class LeetCode274HIndex {
	
	public static int hIndex(int [] citation)
	{
		int[] bucket = new int[citation.length+1];
		for(int i=0;i<citation.length;i++)
		{
			if(citation[i]>citation.length)
			{
				bucket[citation.length]++;
			}
			else
			{
				bucket[citation[i]]++;
			}
		}
		
		int count =0;
		for(int i=bucket.length-1;i>=0;i--)
		{
		count+=bucket[i];
		if(count>=i)
		{
			return i;
		}
		}
		return 0;
	}

	public static void main(String[] args) {
		int [] citation = {3,0,6,1,5};
		System.out.println(hIndex(citation));

	}

}
