package listIterator_Demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("JJK");
		a.add("LOTM");
		a.add("AOT");
		a.add("SAO");
		a.add("GOT");
		
//		System.out.println(a);
		
		System.out.println("---------------");
		ListIterator<String> itr1 = a.listIterator();
		while(itr1.hasNext())
		{
			String str = itr1.next();
			System.out.println(str);
		}
		
		System.out.println("---------------");
		while(itr1.hasPrevious())
		{
			String str1 = itr1.previous();
			System.out.println(str1);
		}	
	}
}
