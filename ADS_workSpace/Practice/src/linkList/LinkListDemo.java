package linkList;

class Node {
	protected int data;
	protected Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkListD {
	private Node head;

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
		temp.next = null;

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
		System.out.println(li.deleteFirst());
		li.display();
		System.out.println(li.deleteLast());
		li.display();

	}
}
