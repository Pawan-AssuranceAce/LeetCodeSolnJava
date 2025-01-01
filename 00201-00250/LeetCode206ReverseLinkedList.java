// coded by own
package leetCodeRevisionOne;

/*class ListNode{
	int val;
	ListNode next;
	ListNode(){};
	ListNode(int x)
	{
		this.val=x;
	}
	ListNode(int x, ListNode next)
	{
		this.val =x;
		this.next = next;
	}
}*/
public class LeetCode206ReverseLinkedList {
	
	public static ListNode reversedLinkedList(ListNode head)
	{
		ListNode curr=head;
		ListNode prev =null;
		ListNode dummy;
		 while(curr!=null)
		 {
			 dummy = curr.next;
			 curr.next = prev;
			 prev=curr;
			 curr=dummy;
		 }
		return prev;
	}
	


	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next =new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next= new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		ListNode temp = reversedLinkedList(head);
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}
		
		

	}

}
