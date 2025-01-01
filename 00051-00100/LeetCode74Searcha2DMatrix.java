//https://www.youtube.com/watch?v=8JI46p5Jv7Q
package leetCodeRevisionOne;

public class LeetCode74Searcha2DMatrix {
	
	public static boolean search2DMatrix(int [][] matrix, int target)
	{
		int rows = matrix.length;
		int columns = matrix[0].length;
		int left =0;
		int right = rows*columns-1;
		while(left<=rows)
		{
			int mid = left+(right-left)/2;
			int row = mid/columns;
			int column = mid%columns;
			if(matrix[row][column]==target)
			{
				return true;
			}
			else if(matrix[row][column]<target)
			{
				left= mid+1;
			}
			else
			{
				right = mid-1;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		System.out.println(search2DMatrix(matrix,target));
	}

}
