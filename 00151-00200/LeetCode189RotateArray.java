//https://www.youtube.com/watch?v=s6i2RzzjZI0&t=127s
package leetCodeRevisionOne;

public class LeetCode189RotateArray {
	
	public static void rotateArray(int [] num, int k)
	{
		k = k%num.length;
		reverse(num,0,num.length-1);
		reverse(num,0,k-1);
		reverse(num,k,num.length-1);
		
	}
	
	public static void reverse(int [] arr, int i,int j)
	{
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
	 int [] num = {1,2,3,4,5,6,7};
	 int k =3;
	 rotateArray(num,k);
	 for(int i : num)
	 {
		 System.out.print(i+", "); 
	 }
	}
}
