package leetCodeRevisionOne;

/*class ListNode
{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int x)
	{
		this.val = x;
	}
	ListNode(int x, ListNode next)
	{
		this.val=x;
		this.next =next;
	}
}*/

public class LeetCode83RemoveDuplicatesfromSortedList {
	
	public static ListNode removeDuplicatesFromSL(ListNode head)
	{
		if(head==null)
		{
			return head;
		}
		ListNode prev = head;
		ListNode curr = head.next;
		while(curr!=null)
		{
		
			if(prev.val==curr.val)
			{
				prev.next = curr.next;
				curr = curr.next;
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
		ListNode ll = new ListNode(1);
		ll.next = new ListNode(1);
		ll.next.next = new ListNode(2);
		ll.next.next.next = new ListNode(3);
		ll.next.next.next.next = new ListNode(3);
		 
		ListNode temp = removeDuplicatesFromSL(ll);
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp = temp.next;
			
		}
		

	}

}
