//arraylist

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Arraylist
{
	public static void main(String[] args)
	{
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		al.add("abhishek");
		al.add("chinmay");
		al.add("nimit");
		
		String element1 = al.get(1);
		System.out.println(al);
		System.out.println(element1);
		System.out.println(al);
		
		ll.add("sneha");
		ll.add("dimple");
		ll.add("maurvi");
		
		String element2 = ll.get(1);
		System.out.println(ll);
		System.out.println(element2);
		System.out.println(ll);
		
	}
}
