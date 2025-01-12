//https://www.youtube.com/watch?v=IGWJg9wDaF0
package leetCodeRevisionOne;

class ListNode
{
	int val;
	ListNode next;
	ListNode random;
	ListNode(int x)
	{
		this.val =x;
		this.next = null;
		this.random = null;
	}
}

public class LeetCode138CopyListwithRandomPointerSoln2 {
	
	public static void copyList(ListNode head)
	{
		ListNode curr = head;
		while(curr!=null)
		{
			ListNode forw = curr.next;
			ListNode node = new ListNode(curr.val);
			curr.next = node;
			node.next = forw;
			
			curr = forw;
		}
	}
	
	public static void copyRandomPointer(ListNode head)
	{
		ListNode curr = head;
		while(curr!=null)
		{
			ListNode random = curr.random;
			if(random!=null)
			{
				curr.next.random = random.next;
			}
			curr = curr.next.next; 
		}
	}
	
	public static ListNode extractList(ListNode head)
	{
		ListNode dummy = new ListNode(-1);
		ListNode curr = head;
		ListNode prev = dummy;
		while(curr!=null)
		{
			prev.next = curr.next;
			curr.next = curr.next.next;
			
			prev = prev.next;
			curr = curr.next;
		}
		return dummy.next;
	}
	
	public static ListNode copyListWithRandom(ListNode head)
	{
		copyList(head);
		copyRandomPointer(head);
		return extractList(head);
		
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
		
		
		ListNode result = copyListWithRandom(head);
		while(result!=null)
		{
			System.out.println(result.val+"->"+result.random.val);
			result = result.next;
		}

	}

}
