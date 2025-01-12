////https://www.youtube.com/watch?v=deaZgauZVco
package leetCodeRevisionOne;

import java.util.HashMap;
import java.util.Scanner;

/*class ListNode
{
	int val;
	ListNode random;
	ListNode next;
	ListNode(int x)
	{
		this.val=x;
		this.random=null;
		this.next=null;
	}
	ListNode(int x,ListNode next)
	{
		this.val=x;
		this.next=next;
	}
}*/
public class LeetCode138CopyListwithRandomPointer {
	
	public ListNode copyRandomList(ListNode head)
	{
		HashMap<ListNode,ListNode> hm = new HashMap<>();
		ListNode curr =head;
		ListNode nhead= new ListNode(-1);
		ListNode prev = nhead;
		 while(curr!=null)
		 {
			 ListNode node = new ListNode(curr.val);
			 prev.next =node;
			 hm.put(curr,node);
			 
			 curr = curr.next;
			 prev = prev.next;
		 }
		 
		 nhead= nhead.next;
		 ListNode c1=head;
		 ListNode c2=nhead;
		 
		 while(c1!=null)
		 {
			 c2.random = (c1.random !=null ? hm.get(c1.random) : null);
			 c1 = c1.next;
			 c2 = c2.next;
		 }
		 return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(7);
		head.next = new ListNode(13);
		head.next.next = new ListNode(11);
		head.next.next.next = new ListNode(10);
		head.next.next.next.next = new ListNode(1);
		head.random = head;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head;
		
		LeetCode138CopyListwithRandomPointer ll = new LeetCode138CopyListwithRandomPointer();
		
		ListNode result = ll.copyRandomList(head);
		while(result!=null)
		{
			System.out.println(result.val+"->"+result.random.val);
			result = result.next;
		}
	}

}
