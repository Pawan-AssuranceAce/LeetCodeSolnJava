//https://www.youtube.com/watch?v=yEbnMaBYB5w
package leetCodeRevisionOne;

import java.util.Stack;

public class LeetCode155MinStack {
	
	Stack<Integer> stack;
	Stack<Integer> minstack;
	
	public void minStack()
	{
		stack = new Stack<>();
		minstack = new Stack<>();
	}
	
	public void push(int val)
	{
		stack.push(val);
		if(minstack.isEmpty() || minstack.peek()>=val)
		{
			minstack.push(val);
		}
	}
	
	public void pop()
	{
		if(stack.peek().equals(minstack.peek()))
		{
			minstack.pop();
		}
		stack.pop();
	}
	
	public int top()
	{
		return stack.peek();
	}
	
	public int getmin()
	{
		return minstack.peek();
	}
	

	public static void main(String[] args) {
		
		LeetCode155MinStack ms = new LeetCode155MinStack();
		ms.minStack();
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getmin()); // return -3
		ms.pop();
		ms.top();    // return 0
		System.out.println(ms.getmin());

	}

}
