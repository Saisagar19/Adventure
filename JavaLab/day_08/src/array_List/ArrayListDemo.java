package array_List;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		arr.add(5);
		arr.add(10);
		arr.add("SuperCalifragialisticExpiliadocious");
		arr.add(50.55f);

		System.out.println(arr);

		arr.add(1, 20);
		System.out.println(arr);
		System.out.println(arr.get(3));

		ArrayList arr2 = new ArrayList();
		arr2.add(100);
		arr.addAll(arr2);
		System.out.println(arr);

//	int a = (Integer)arr.get(1);
		for (Object o : arr2) {
			System.out.println(o);
//		Integer obj = (Integer)o;
		}
	}
}
