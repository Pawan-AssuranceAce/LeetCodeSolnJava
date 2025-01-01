//https://www.youtube.com/watch?v=2X-bA6cjm4k
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
public class LeetCode2AddTwoNumbers {
	
	public static ListNode addTwoNumbers(ListNode ll1, ListNode ll2)
	{
		ListNode temp = new ListNode(0);
		ListNode head = temp;
		int carry =0;
		 
		while(ll1!=null || ll2!=null)
		{
			if(ll1!=null)
			{
				carry += ll1.val;
				ll1 = ll1.next;
			}
			if(ll2!=null)
			{
				carry += ll2.val;
				ll2 = ll2.next;
			}
			
			temp.next = new ListNode(carry%10);
			temp = temp.next;
			carry = carry/10;
		}
		if(carry==1)
		{
			temp.next = new ListNode(1);
		}
		
		return head.next;
	}
	
	
	
	

	public static void main(String[] args) {
		
		ListNode ll1 = new ListNode(9);
		ll1.next = new ListNode(9);
		ll1.next.next=new ListNode(9);
		ll1.next.next.next=new ListNode(9);
		ll1.next.next.next.next=new ListNode(9);
		ll1.next.next.next.next.next=new ListNode(9);
		ll1.next.next.next.next.next.next=new ListNode(9);
		ll1.next.next.next.next.next.next.next=new ListNode(9);
		ll1.next.next.next.next.next.next.next.next=new ListNode(9);
		ll1.next.next.next.next.next.next.next.next.next=new ListNode(9);
		
		ListNode ll2 = new ListNode(9);
		ll2.next = new ListNode(9);
		ll2.next.next=new ListNode(9);
		ll1.next.next.next=new ListNode(9);
		ll1.next.next.next.next=new ListNode(9);
		
		ListNode res = addTwoNumbers(ll1,ll2);
		while(res!=null)
		{
			System.out.println(res.val);
			res = res.next;
		}
		
		
	
		

	}

}
