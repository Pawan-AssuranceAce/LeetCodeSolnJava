////https://www.youtube.com/watch?v=MC32BuGf-fM&t=302s
package leetCodeRevisionOne;

/*class ListNode
{
	int val;
	ListNode next;
	ListNode(){};
	ListNode(int val)
	{
		 this.val =val;
	}
	ListNode(int val, ListNode next)
	{
		this.val = val;
		this.next = next;
	}	
}*/

public class LeetCode21MergeTwoSortedLists
{

public static ListNode mergeTwoSorted(ListNode ll1, ListNode ll2)
{
	ListNode head =null;
	ListNode ptr = null;
	if(ll1==null)
	{
		return ll2;
	}
	if(ll2==null)
	{
		return ll1;
	}
	
	while(ll1!=null && ll2!=null)
	{
		if(head==null)
		{
			if(ll1.val<ll2.val)
			{
			ptr=head=ll1;
			ll1=ll1.next;
			}
			else
			{
				ptr=head=ll2;
				ll2=ll2.next;
			}
			continue;
		}
		if(ll1.val<ll2.val)
		{
			ptr.next = ll1;
			ptr = ll1;
			ll1 = ll1.next;
		}
		else
		{
			ptr.next = ll2;
			ptr = ll2;
			ll2 = ll2.next;
		}
		if(ll1!=null)
		{
			ptr.next = ll1;
		}
		else
		{
			ptr.next = ll2;
		}
	}
	return head;
}

public static void main(String[] args)
{
	ListNode ll1 = new ListNode(1);
	ll1.next = new ListNode(2);
	ll1.next.next = new ListNode(4);
	ListNode ll2 = new ListNode(1);
	ll2.next = new ListNode(3);
	ll2.next.next = new ListNode(4);
	ListNode temp = mergeTwoSorted(ll1, ll2);
	{
		while(temp!=null)
		{
			System.out.println(temp.val +" ");
			temp = temp.next;
		}
	}
	
	
}
}


