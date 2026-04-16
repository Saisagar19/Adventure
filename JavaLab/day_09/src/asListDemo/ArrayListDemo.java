package asListDemo;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		Character ch[] = {'A','E','I','O','U'};
//		List list = Arrays.asList(ch);
		List<Character> list = Arrays.asList(ch);
		System.out.println(list);
//		list.set(1, 'M');
//		System.out.println(list);
		list.forEach(x -> {System.out.print(x+" ");});
		
//		list.add('N'); // UnsupportedOperationException
//		System.out.println(list);
//		list.set(0, "ABC");
//		System.out.println(list); //ArrayStoreException
		
		
	}

}
