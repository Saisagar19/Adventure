package linkedList;

class Node {
	protected int data;
	protected Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

class LinkListD {
	Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

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
		last = null;
		temp.next = null;

		return d;

	}

	public void insertAtPos(int val, int pos) {
		Node new_node = new Node(val);
		if (pos <= 0) {
			System.out.println("Enter a valid number");
			return;
		}
		if (pos == 1) {
			if (head == null) {
				head = new_node;
				return;
			}
			new_node.next = head;
			head = new_node;
			return;
		}

		Node itr = head;
		for (int i = 1; i < pos - 1 && itr != null; i++) {
			itr = itr.next;
		}

		if (itr == null) {
			System.out.println("Invalid Pos");
			return;
		}

		new_node.next = itr.next;
		itr.next = new_node;
	}

	public Node SwapOddFirstEvenLast() {
		if (head == null || head.next == null) {
			return head;
		}

		Node odd = head;
		Node even = head.next;
		Node evenHead = even;

		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;

			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}

//	Remove Nth Node from the end of the LinkedList
	public Node RemoveNthNodeFrmEnd(int n) {
		int cnt = 0;
		Node itr = head;
		while (itr != null) {
			cnt++;
			itr = itr.next;
		}
		if (cnt == n) {
			Node newNode = head.next;
			head = newNode;
			return head;
		}
		int res = cnt - n;
		Node temp = head;
		while (temp != null) {
			res--;
			if (res == 0) {
				break;
			}
			temp = temp.next;
		}
		Node deleteNode = temp.next;
		temp.next = temp.next.next;
		deleteNode.next = null;

		return head;

	}

//	Remove Nth Node from the end of the LinkedList using Tortoise and Hare Algo.
	public Node RemoveNth(int n) {
		Node slow = head;
		Node fast = head;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		Node deleteN = slow.next;
		slow.next = slow.next.next;
		deleteN.next = null;

		return head;
	}

//	Delete the middle node of the LinkedList

	public Node deleteMiddleNode() {
		Node slow = head;
		Node fast = head;

		if (head == null || head.next == null) {
			return null;
		}

		fast = fast.next.next; // we already moved the fast by one step meaning it will skip the slow node by 1
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node deleteNode = slow.next;
		slow.next = slow.next.next;
		deleteNode.next = null;

		return head;
	}

//Merge two sorted Linked Lists
	public Node mergeSortedList(Node head1, Node head2) {

		Node t1 = head1;
		Node t2 = head2;
		Node dummyNode = new Node(-1);
		Node temp = dummyNode;

		while (t1 != null && t2 != null) {
			if (t1.data < t2.data) {
				temp.next = t1;
				temp = t1;
				t1 = t1.next;
			} else {
				temp.next = t2;
				temp = t2;
				t2 = t2.next;
			}
		}
		if (t1 != null) {
			temp.next = t1;
		} else {
			temp.next = t2;
		}

		return dummyNode.next;

	}

//	Merge Two Linked Lists into a 3rd List (Java)
	public Node mergeList(Node head1, Node head2) {
		Node dummy = new Node(0);
		Node temp = dummy;

		while (head1 != null && head2 != null) {
			temp.setNext(new Node(head1.getData()));
			temp = temp.getNext();
			head1 = head1.getNext();

			temp.setNext(new Node(head2.getData()));
			temp = temp.getNext();
			head2 = head2.getNext();
		}
		while (head1 != null) {
			temp.setNext(new Node(head1.getData()));
			temp = temp.getNext();
			head1 = head1.getNext();
		}

		while (head2 != null) {
			temp.setNext(new Node(head2.getData()));
			temp = temp.getNext();
			head2 = head2.getNext();
		}
		return dummy.getNext();
	}

//	Merge Two Linked Lists Direct(Java)

	public Node mergeDirect(Node list1, Node list2) {
		Node dummy = new Node(0);
		Node temp = dummy;

		while (list1 != null) {
			temp.setNext(new Node(list1.data));
			temp = temp.getNext();
			list1 = list1.getNext();
		}

		while (list2 != null) {
			temp.setNext(new Node(list2.data));
			temp = temp.getNext();
			list2 = list2.getNext();
		}

		head = dummy.getNext();
		return head;
	}

}

public class LinkListDemo {
	public static void main(String[] args) {

		LinkListD li = new LinkListD();
		li.insertLast(10);
		li.insertLast(20);
		li.insertLast(55);
		li.insertLast(66);
		li.insertLast(77);
//		li.display();
//		System.out.println(li.deleteFirst());
//		li.display();
//		System.out.println(li.deleteLast());
//		li.display();

//		li.insertAtPos(45, 5);
//		li.display();
//		System.out.println("------------------SwapOddFirstEvenLast-------------------");
//		li.SwapOddFirstEvenLast();
//		li.display();
//		System.out.println("------------------Remove Nth Node-------------------");
//		li.RemoveNthNodeFrmEnd(5);
//		li.display();
//		System.out.println("------------------Remove Nth Node using Algo-------------------");
//		li.RemoveNth(5);
//		li.display();

//		li.deleteMiddleNode();
//		li.display();

		LinkListD li1 = new LinkListD();
		li1.insertLast(1);
		li1.insertLast(2);
		li1.insertLast(5);
		li1.insertLast(7);
		li1.insertLast(9);
		li1.insertLast(10);

//		System.out.println("------Sorted Merge--------");
//		LinkListD res = new LinkListD();
//		res.head = li.mergeSortedList(li.head, li1.head);
//		res.display();
		// 1 -> 2 -> 5 -> 7 -> 9 -> 10 -> 10 -> 20 -> 55 -> 66 -> 77 -> null

//		System.out.println("------Alternate Merge--------");
//		LinkListD merg = new LinkListD();
//		merg.setHead(li.mergeList(li.getHead(), li1.getHead())); 
//		merg.display();
//		10 -> 1 -> 20 -> 2 -> 55 -> 5 -> 66 -> 7 -> 77 -> 9 -> 10 -> null

//		System.out.println("------Direct Merge--------");
//		LinkListD mergDirect = new LinkListD();
//		mergDirect.head = li.mergeDirect(li.getHead(),li1.getHead());
//		mergDirect.display();
		// 10 -> 20 -> 55 -> 66 -> 77 -> 1 -> 2 -> 5 -> 7 -> 9 -> 10 -> null

	}
}
