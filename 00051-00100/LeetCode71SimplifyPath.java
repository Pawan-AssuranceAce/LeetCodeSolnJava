//https://www.youtube.com/watch?v=jFyOrLNvJQM
package leetCodeRevisionOne;

import java.util.Stack;

public class LeetCode71SimplifyPath {
	
	public static String simplifyPath(String s)
	{
		String [] str = s.split("/");
		Stack<String> stack = new Stack<>();
		for(String i : str)
		{
			if(i.equals("..") && !stack.isEmpty())
			{
				stack.pop();
			}
			else if(!i.equals("") && !i.equals(".") && !i.equals(".."))
			{
				stack.push(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String j : stack)
		{
			sb.append("/");
			sb.append(j);
		}
		return sb.length()==0 ? "/" : sb.toString();
	}

	public static void main(String[] args) {
		String s = "/home/user/Documents/../Pictures";
		System.out.println(simplifyPath(s));
	}

}
