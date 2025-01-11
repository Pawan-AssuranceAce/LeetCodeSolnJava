package leetCodeRevisionOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LeetCode380InsertDeleteGetRandomO1 {
	
	static HashMap<Integer,Integer> hm;
	static List<Integer> list;

	public static void Randomset()
	{
		hm = new HashMap<>();
		list = new ArrayList<>();
	}
	
	public static boolean insert(int val)
	{
		if(hm.containsKey(val))
		{
			return false;
		}
		else
		{
			list.add(val);
			hm.put(val, list.size()-1);
			return true;
		}
	}
	
	public static boolean remove(int val)
	{
		if(hm.containsKey(val)==false)
		{
			return false;
		}
		else
		{
			int ind = hm.get(val);
			Collections.swap(list,ind, list.size()-1);
			int swapwith = list.get(ind);
			hm.put(swapwith, ind);
			list.remove(list.size()-1);
			hm.remove(val);
			return true;
			
			
		}
	}
	
	public static int getRandom()
	{
		Random rm = new Random();
		int n = rm.nextInt(list.size());
		return list.get(n);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Randomset();
		System.out.println("Enter the value:");
		int val = scn.nextInt();
		insert(val);
		val = scn.nextInt();
		insert(val);
		val = scn.nextInt();
		insert(val);
		val = scn.nextInt();
		insert(val);
		val = scn.nextInt();
		insert(val);
		val = scn.nextInt();
		insert(val);
		val = scn.nextInt();
		System.out.println("Enter the value to remove:");
		int rem = scn.nextInt();
		remove(rem);
		System.out.println(getRandom());

	}

}
