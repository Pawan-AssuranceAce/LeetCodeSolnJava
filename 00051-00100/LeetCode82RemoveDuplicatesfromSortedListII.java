//https://www.youtube.com/watch?v=yRlZ5cnqccQ
package leetCodeRevisionOne;


/*class ListNode
{
	int val;
	ListNode next;
	ListNode(int x)
	{
		this.val=x;
	}
	ListNode(int x, ListNode next)
	{
		this.val=x;
		this.next=next;
	}
}*/
public class LeetCode82RemoveDuplicatesfromSortedListII {
	
	public static ListNode removeDuplicatesFromSortedList(ListNode head)
	{
		ListNode prev = null;
		ListNode curr = head;
		while(curr!=null)
		{
			if(curr.next!=null && curr.val==curr.next.val)
			{
				int val = curr.val;
				while(curr!=null && curr.val==val)
				{
					curr = curr.next;
				}
				if(prev!=null)
				{
					prev.next = curr;
				}
				else
				{
					head = curr;
				}
			}
			else
			{
				prev = curr;
				curr = curr.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode res = removeDuplicatesFromSortedList(head);
		while(res!=null)
		{
			System.out.println(res.val);
			res = res.next;
		}
	}

}
