//https://www.youtube.com/watch?v=IxXf_7LVGpg
package leetCodeRevisionOne;
//ListNode head;
/*class ListNode
{
	int val;
	ListNode next;
	ListNode(int x)
	{
		this.val =x;
		next = null;
	}
}*/

public class LeetCode141LinkedListCycle {

	
	public boolean hasCycle(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(40);
		head.next.next.next.next = new ListNode(40);
		head.next.next.next.next =head.next.next;
		
		LeetCode141LinkedListCycle ll = new LeetCode141LinkedListCycle();
			System.out.println(ll.hasCycle(head));
	}

}
