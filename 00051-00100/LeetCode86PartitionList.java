//https://www.youtube.com/watch?v=b4FeEwAGDtU
package leetCodeRevisionOne;

/*class ListNode
{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int x)
	{
		this.val =x;
	}
	ListNode(int x, ListNode next)
	{
		this.val =x;
		this.next = next;
	}
}*/

public class LeetCode86PartitionList {
	
	public static ListNode partitionList(ListNode head, int p)
	{
		ListNode small = new ListNode(0);
		ListNode high = new ListNode(0);
		ListNode smallhead =small;
		ListNode highhead = high;
		
		while(head!=null)
		{
			if(head.val<p)
			{
				smallhead.next = head;
				smallhead = smallhead.next;
			}
			else
			{
				highhead.next = head;
				highhead = highhead.next;
				
			}
			head = head.next;
		}
		highhead.next = null;
		smallhead.next = high.next;
		return small.next;
	}
	

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
		int p = 3;
		ListNode res = partitionList(head,p);
		while(res!=null)
		{
			System.out.println(res.val);
			res = res.next;
		}
		
	}

}
