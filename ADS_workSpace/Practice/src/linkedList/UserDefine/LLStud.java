package linkedList.UserDefine;

class Node {

	protected Student data;
	protected Node next;

	public Node(Student data) {
		this.data = data;
		this.next = null;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class StudLL {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insertFirst(Student d) {
		Node new_node = new Node(d);
		if (head == null) {
			head = new_node;
			return;
		}

		new_node.next = head;
		head = new_node;
	}

	public Student deleteFirst() {
		Student d = null;
		if (head == null) {
			return d;
		}
		Node first = head;
		d = first.data;
		head = first.next;
		first.next = null;
		first = null;
		return d;
	}

	public void insertLast(Student d) {
		Node new_node = new Node(d);
		if (head == null) {
			head = new_node;
			return;
		}
		Node itr = head;
		while (itr.next != null) {
			itr = itr.next;
		}
		itr.next = new_node;
		new_node.next = null;
	}

	public Student deleteLast() {
		Student d = null;
		if (head == null) {
			return d;
		}
		if (head.next == null) {
			d = head.data;
			head = null;
			return d;
		}

		Node itr = head;
		while (itr.next.next != null) {
			itr = itr.next;
		}
		Node last = itr.next;
		d = last.data;
		last = null;
		itr.next = null;
		return d;
	}
	
	private static Node LLReverse(Node head)
	{
		Node rev;
		if(head.next == null)
		{
			return head;
		}
		rev = LLReverse(head.next);
		head.next.next = head;
		head.next = null;
		return rev;
	}
	public void LLRev(Node h)
	{
		head = LLReverse(h);
	}

	public void displayStud() {
		if (head == null) {
			System.out.println("Empty Student Data");
			return;
		}
		Node itr = head;
		while (itr != null) {
			System.out.print(itr.data + "---->");
			itr = itr.next;
		}
		System.out.println("null");
	}

}

public class LLStud {
	public static void main(String[] args) {
		Student s1 = new Student(1,"sagar",32);
		Student s2 = new Student(2,"sidd",36);
		Student s3 = new Student(3,"swayam",38);
		Student s4 = new Student(4,"amman",33);
		Student s5 = new Student(5,"digi",39);
		
		StudLL li = new StudLL();
		li.insertFirst(s1);
		li.insertLast(s2);
		li.insertLast(s3);
		li.insertLast(s4);
		li.insertLast(s5);
//		li.displayStud();
//		
//		System.out.println(li.deleteFirst());
//		li.displayStud();
//		
//		System.out.println(li.deleteLast());
//		li.displayStud();
		System.out.println("Before Reverse");
		li.displayStud();
		System.out.println("After Reverse");
		li.LLRev(li.getHead());
		li.displayStud();
		
	}
}
