package dsa.binaryTree;

class Node {
	protected int data;
	protected Node next;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int data) {
		super();
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

class QueueLLDemo {

	private Node rear, front;

	public QueueLLDemo() {
		this.rear = null;
		this.front = null;
	}

	public boolean isEmpty() {
		if (this.front == null) {
			return true;
		}
		return false;
	}

	public void enqueue(int data) {
		Node new_node = new Node(data);

		if (this.rear == null) {
			this.front = new_node;
			this.rear = new_node;
			return;
		}
		this.rear.next = new_node;
		this.rear = new_node;
	}

	public int dequeue() {
		int d = -999;
		if (isEmpty()) {
			System.out.println("Empty Queue....");
			return d;
		}
		d = this.front.data;
		Node temp = front;

		front = front.next;
		if (front == null) {
			rear = null;
		}
		temp.next = null;
		return d;
	}

	public void display() {
		if (front == null) {
			System.out.println("Empty.....");
			return;
		}
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

}

public class QueueLL {
	public static void main(String[] args) {

		QueueLLDemo q = new QueueLLDemo();
		q.enqueue(12);
		q.enqueue(19);
		q.enqueue(25);
		q.enqueue(1);
		q.enqueue(2);
		q.display();
		
	}
}
