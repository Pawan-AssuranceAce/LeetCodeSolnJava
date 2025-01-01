//https://www.youtube.com/watch?v=uT7YI7XbTY8
package leetCodeRevisionOne;

/*class ListNode{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int x)
	{
		this.val = x;
	}
	ListNode(int x, ListNode next)
	{
		this.val = x;
		this.next = next;
	}
}*/
public class LeetCode61RotateList {
	
	public static ListNode findnthNode(ListNode temp, int l )
	{
		int count =1;
		while(temp!=null)
		{
			if(count==l)
			{
				return temp;
			}
			else
			{
				count++;
			}
			temp = temp.next;
		}
		return temp;
	}
	
	
	public static ListNode rotateList(ListNode head, int k)
	{
		ListNode tail = head;
		int lengthNode =1;
		if(head==null || k==0)
		{
			return head;
		}
		
		while(tail.next!=null)
		{
			tail = tail.next;
			lengthNode++;
		}
		if(k%lengthNode==0)
		{
			return head;
		}
		k=k%lengthNode;
		tail.next = head;
		ListNode newLastNode = findnthNode(head,lengthNode-k);
		head = newLastNode.next;
		newLastNode.next =null;
		return head;
	}
	

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		int k = 2;
		ListNode res = rotateList(head,k);
		while(res!=null)
		{
			System.out.println(res.val);
			res = res.next;
		}
	}

}
