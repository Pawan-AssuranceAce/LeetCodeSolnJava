//https://www.youtube.com/watch?v=1dW442I3xrI
package leetCodeRevisionOne;

/*class ListNode
{
	int val;
	ListNode next;
	ListNode(){}
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


public class LeetCode19RemoveNthNodeFromEndofList {
	
	public static ListNode removeNthNode(ListNode head, int n)
	{
		ListNode temp=head;
		int count =0;
		
		while(temp!=null)
		{
			count++;
			temp = temp.next;
		}
		int steps =count-n;
		temp = head;
		if(steps==0)
		{
			return head.next;
		}
		for(int i=0; i<steps;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		int n = 3;
		ListNode res = removeNthNode(head,n);
		while(res!=null)
		{
			System.out.println(res.val);
			res = res.next;
		}
		
		

	}

}
