//https://www.youtube.com/watch?v=oDL8vuu2Q0E
//https://github.com/nikoo28/java-solutions/blob/master/src/main/java/leetcode/medium/ReverseLinkedListII.java
package leetCodeRevisionOne;

/*class ListNode{
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

public class LeetCode92ReverseLinkedListII {
	
	public static ListNode reverseLinkedList(ListNode head, int left, int right)
	{
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode leftpre = dummy;
		ListNode currnode = head;
		for(int i=0;i<left-1;i++)
		{
			leftpre = leftpre.next;
			currnode = currnode.next;		
		}
		ListNode sublisthead = currnode;
		ListNode prevnode =null;
		{
			for(int i=0;i<=right-left;i++)
			{
				ListNode nextNode = currnode.next;
				currnode.next = prevnode;
				prevnode = currnode;
				currnode = nextNode;			
			}
		}
		leftpre.next = prevnode;
		sublisthead.next = currnode;
		return dummy.next;
	}


	public static void main(String[] args) {
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	head.next.next.next = new ListNode(4);
	head.next.next.next.next = new ListNode(5);
	int left = 2;
	int right =4;
	ListNode res = reverseLinkedList(head,left,right);
	while(res!=null)
	{
		System.out.println(res.val);
		res = res.next;
	}
}
}
