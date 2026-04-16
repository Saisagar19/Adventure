package vector_test;

import java.util.Vector;

public class VectorQue {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>(15);
		for(int i = 0; i < 15; i++)
		{
			vec.add(i);
		}
		System.out.println(vec);
		
		for(int i = 0; i < 5; i++)
		{
//			vec.remove(0);	
			vec.remove(i);	// it left shift the element
			
		}
		System.out.println(vec);
	}
}
