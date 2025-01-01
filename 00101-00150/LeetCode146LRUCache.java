//https://www.youtube.com/watch?v=rRLXvqTyQ8k
package leetCodeRevisionOne;

import java.util.HashMap;

/*class ListNode{
	int key;
	int value;
	ListNode prev;
	ListNode next;
	ListNode(int k, int v)
	{
		this.key = k;
		this.value = v;
	}
}*/

public class LeetCode146LRUCache {
	
	private HashMap<Integer,ListNode> map = new HashMap<>();
	private ListNode head;
	private ListNode last;
	private int capacity;
	
	public void LRUchace(final int capacity)
	{
		this.capacity = capacity;
		head = new ListNode(0,0);
		last = new ListNode(0,0);
		head.next = last;
		last.prev = head;
	}
	
	
	public int get(int key)
	{
		ListNode node = map.get(key);
		if(node==null)
		{
			return -1;
		}
		remove(node);
		insert(node);
		return node.value;
	}
	
	public void put(int key, int value)
	{
		if(map.containsKey(key))
		{
			remove(map.get(key));
		}
		if(map.size()==capacity)
		{
			remove(last.prev);
			
		}
		insert(new ListNode(key,value));
	}
	
	private void insert(ListNode node)
	{
		map.put(node.key, node);
		node.next = head.next;
		head.next.prev = node;
		node.prev = head;;
		node.next = node;
		
	}
	
	private void remove(ListNode node)
	{
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	public static void main(String[] args) {
		LeetCode146LRUCache lru = new LeetCode146LRUCache();
		lru.LRUchace(2);
		lru.put(1, 1);
		lru.put(2, 2);
		System.out.println(lru.get(1));
		lru.put(3,3);
		System.out.println(lru.get(2));
		lru.put(4, 4);
		System.out.println(lru.get(1));
		System.out.println(lru.get(3));
		System.out.println(lru.get(4));
		
		
		


	}

}
