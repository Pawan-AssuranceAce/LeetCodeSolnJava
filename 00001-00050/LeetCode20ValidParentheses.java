package leetCodeRevisionOne;

import java.util.Stack;

public class LeetCode20ValidParentheses {
	
	public static boolean validParentheses(String s)
	{
		char [] c = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i =0; i<c.length;i++)
		{
			if(stack.isEmpty())
			{
				stack.push(c[i]);
			}
			else
			{
				char top = stack.peek();
			if(c[i]-top ==1 || c[i]-top==2)
			{
				stack.pop();
			}
			else
			{
				stack.push(c[i]);
			}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "([])";
		System.out.println(validParentheses(s));
	}

}
