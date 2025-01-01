//https://www.youtube.com/watch?v=HqR-AAvttnc
package leetCodeRevisionOne;

public class LeetCode34FindFirstandLastPositionofElementinSortedArray {
	
	public static int[] findFirstandLastPosition(int [] num, int target)
	{
		int left =0;
		int right =num.length-1;
		int findx = -1;
		int lindx = -1;
		
		 while(left<=right)
		 {
			 int mid = left+(right-left)/2;
			 if(num[mid]==target)
			 {
				 findx = mid;
				 right = mid-1;
			 }
			 else if(target>num[mid])
			 {
				 left = mid+1;
			 }
			 else if(target<num[mid])
			 {
				 right = mid-1;
			 }
		 }
		 
		 left =0;
		 right = num.length-1;
		 while(left<=right)
		 {
			 int mid = left+(right-left)/2;
			 if(num[mid]==target)
			 {
				 lindx = mid;
				 left = mid+1;
			 }
			 else if(target>num[mid])
			 {
				 left = mid+1;
			 }
			 else if(target<num[mid])
			 {
				 right=mid-1;
			 }
		 }
		 
		 int [] res = {findx,lindx};
		 return res;
		
	}

	
	public static void main(String[] args) {
		int [] num = {5,7,7,8,8,10};
		int target = 8 ;
		int[] res = findFirstandLastPosition(num,target);
		for(int r : res)
		{
			System.out.println(r);
		}

	}

}
