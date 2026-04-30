package dsa.Recursion;

public class LLReverse {
	
	public static intNode revLL(intNode head)
	{
		if(head.getNext() == null)
		{
			return head;
		}
		intNode temp;
		temp = revLL(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return temp;
	}
	
	public static void main(String[] args) {
		LinkedList11 li = new LinkedList11();
		li.insertFirst(10);
		li.insertLast(20); 
		li.insertLast(30);
		
		li.setHead(revLL(li.getHead()));
		li.display();
		
		
				
		
	
	}
	

}
