package mapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("Sagar", 800);
		h.put("Sahil", 500);
		h.put("Ankit", 805);
		h.put("Yuvraj", 568);
		h.put("Siddharth", 1000);
		System.out.println(h);
		
		Set<String> s = h.keySet();			// it returns key only and store it into set.
		System.out.println(s); 
		
		Collection<Integer> c = h.values()	;
		System.out.println(c);
		
		Set<Entry<String, Integer>> s1 = h.entrySet();
		System.out.println(s1);
		
		System.out.println("-----------------------");
		Iterator<Map.Entry<String, Integer>> itr  = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> i = itr.next();
			System.out.println(i.getKey()+" "+i.getValue());
			if(i.getKey().equals("Ankit"))
			{
				i.setValue(900);
			}
		}
		System.out.println(h);
		
	}
}
