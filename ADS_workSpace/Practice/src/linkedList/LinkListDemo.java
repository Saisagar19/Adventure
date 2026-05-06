package linkedList;

class Node {
	protected int data;
	protected Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkListD {
	 Node head;

	public void insertFirst(int d) {
		Node temp = new Node(d);
		temp.next = head;
		head = temp;
	}

	public int deleteFirst() {
		int d = -999;
		if (head == null) {
			return d;
		}
		Node node = head;
		d = node.data;
		head = head.next;
		node.next = null;
		node = null;
		return d;
	}

	public void display() {
		if (head == null) {
			System.out.println("Empty linkList");
			return;
		}
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.println("null");
	}

	public void insertLast(int d) {
		Node node = new Node(d);
		if (head == null) {
			head = node;
			return;
		}
		Node itr = head;
		while (itr.next != null) {
			itr = itr.next;
		}
		itr.next = node;
	}

	public int deleteLast() {
//		int d = -999;
//		if (head == null) {
//			d = head.data;
//			head = null;
//			return d;
//		}
//		Node itr = head;
//		while (itr.next.next != null) {
//			itr = itr.next;
//		}
//		Node node = itr.next;
//		d = node.data;
//		node = null;
//		itr.next = null;
//		return d;
		int d = -999;
		if (head == null || head.next == null) {
			d = head.data;
			head = null;
			return d;
		}

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node last = temp.next;
		d = last.data;
		last=null;
		temp.next = null;
		
		return d;

	}
	
	public void insertAtPos(int val, int pos)
	{
		Node new_node = new Node(val);
		if(pos <= 0)
		{
			System.out.println("Enter a valid number");
			return;
		}
		if(pos == 1)
		{
			if(head == null)
			{
				head = new_node;
				return;
			}
			new_node.next = head;
			head = new_node;
			return;
		}
		
		Node itr = head;
		for(int i = 1; i < pos -1 && itr != null; i++)
		{
			itr = itr.next;
		}
		
		if(itr == null)
		{
			System.out.println("Invalid Pos");
			return;
		}
		
		new_node.next = itr.next;
		itr.next = new_node;
	}
}

public class LinkListDemo {
	public static void main(String[] args) {

		LinkListD li = new LinkListD();
		li.insertFirst(10);
		li.insertFirst(20);
		li.insertFirst(55);
		li.insertLast(66);
		li.display();
//		System.out.println(li.deleteFirst());
//		li.display();
//		System.out.println(li.deleteLast());
//		li.display();
		
		li.insertAtPos(45, 5);
		li.display();

	}
}
