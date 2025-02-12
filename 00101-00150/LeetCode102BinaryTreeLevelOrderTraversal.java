package leetCodeRevisionOne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {};
	TreeNode(int val)
	{
		this.val=val;
	}
	TreeNode(int val, TreeNode left, TreeNode right)
	{
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
}

public class LeetCode102BinaryTreeLevelOrderTraversal {
	
	public static List<List<Integer>> binaryTreeLevel(TreeNode root)
	{
		List<List<Integer>> output = new ArrayList<>();
		if(root==null)
		{
			return output;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		
		while(!queue.isEmpty())
		{
			List<Integer> list1 = new ArrayList<>();
			int size = queue.size();
			for(int i=0;i<size;i++)
			{
				TreeNode node = queue.poll();
				list1.add(node.val);
				if(node.left!=null)
				{
					queue.add(node.left);
				}
				if(node.right!=null)
				{
					queue.add(node.right);
				}
			}
			output.add(list1);
		}
		return output;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		List<List<Integer>> list= binaryTreeLevel(root);
		for(List<Integer> k:list)
		{
			System.out.println(k);
		}
	}

}
