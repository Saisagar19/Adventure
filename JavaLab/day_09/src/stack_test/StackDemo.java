package stack_test;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(10);
		st.push('A');
		st.push("ABC");
		st.push(10.1f);
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		System.out.println(st.peek());
		// reads from top to bottom and returns index of element from top
		System.out.println(st.search("ABC"));
		System.out.println(st.search('Z'));
		
		
	}
}
