import java.util.ArrayList;

public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList alist = new ArrayList();
		alist.add("Apple");
		alist.add("Banana");
		
		System.out.println(alist);
		
		alist.remove("Banana");
		System.out.println(alist);
		
		alist.add(1, "Chiccoo");
		System.out.println(alist);
		
		if(alist.contains("Apple"))
		{
			System.out.println("It's there");
		}
		
		System.out.println(alist.size());
	}
}
