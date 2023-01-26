//arraylist

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("1. Add item to list");
		System.out.println("2. Remove item from list");
		System.out.println("3. Print list");
		System.out.println("4. Exit");
		
		int choice = scan.nextInt();
		scan.nextLine();
		
		switch(choice)
		{
			case 1 : System.out.print("Enter item : ");
			String item = scan.nextLine();
			alist.add(item);
			break;
			
			case 2 : System.out.print("Enter item : ");
			item = scan.next();
			alist.remove(item);
			break;
			
			case 3 : System.out.println("To-Do list : ");
			for(String list : alist)
			{
				System.out.println(list);
			}
						break;
			
			case 4 : //System.out.print("Enter item : ");
			System.exit(0);
			
			
			default : System.out.println("Invalid choice. Please try again.");
			break;
		}
		}
	}
}
