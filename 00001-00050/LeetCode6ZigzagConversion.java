package leetCodeRevisionOne;

public class LeetCode6ZigzagConversion {
	
	
	public static String zigzagConversion(String s, int numrows)
	{
		//Define StringBuilders
		StringBuilder [] sb = new StringBuilder[numrows];
		for(int i=0; i<numrows; i++)
		{
			sb[i]= new StringBuilder();
		}
		
		//Define Variables
		char[] arr = s.toCharArray();
		int n = s.length();
		int index =0;
		
		//Traverse zig zag
		while(index<n)
		{
			//Go down
		for(int i =0; i<numrows && index<n ;i++)
		{
			sb[i].append(arr[index]);
			index++;
		}
		
		//Go Up before start
		for(int j=numrows-2 ; j>0 && index<n ; j-- )
		{
			sb[j].append(arr[index]);
			index++;
		}
		}
		//Combine all stringbuilders into one
		StringBuilder res = sb[0];
		for(int i=1; i<numrows;i++)
		{
			res.append(sb[i].toString());
		}
		
		return res.toString();
	}

	public static void main(String[] args) {
		
		String s = "PAYPALISHIRING";
		int numrows = 4;
		System.out.println(zigzagConversion(s,numrows));
		

	}

}
