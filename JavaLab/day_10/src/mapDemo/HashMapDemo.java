package mapDemo;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>(); //capacity is  16 
		h.put(8, "Sagar");
		h.put(19, "Necro");
		h.put(9, "Siddharth");
		h.put(6, "Amman");			// insertion order is not preserved
		System.out.println(h);
		System.out.println(h.put(19, "Digvijay"));	// it returns the existing value and changes with new value if key is same
//		h.put(null, null);		// null insertion is possible
		System.out.println(h);
	}

}
