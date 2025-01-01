package leetCodeRevisionOne;

public class LeetCode88MergeSortedArray {
	
	public static void merge(int[] num1, int m, int[] num2, int n)
	{
		int p = num1.length-1;
		int p1 = m-1;
		int p2 = n-1;
		 while(p>=0)
		 {
			 int element1, element2;
			 element1 = (p1>=0) ? num1[p1] : Integer.MIN_VALUE;
			 element2 = (p2>=0) ? num2[p2] : Integer.MIN_VALUE;
			 
			 if(element1>element2)
			 {
				 num1[p]=element1;
				 p1--;
				 p--;	 
			 }
			 else
			 {
				 num1[p]=element2;
				 p2--;
				 p--;
			 } 
		 }
	}
	

	public static void main(String[] args) {
		
		int[] num1 = {1,2,3,0,0,0};
		int m =3;
		int[] num2 = {2,5,6};
		int n =3;
		merge(num1,m,num2,n);
		for(int n1 : num1)
		{
			System.out.println(n1);
		}
		
		

	}

}
