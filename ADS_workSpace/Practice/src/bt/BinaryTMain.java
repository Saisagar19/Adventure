package bt;

import java.util.LinkedList;
import java.util.Queue;

class BTNode {
	private int data;
	private BTNode left;
	private BTNode right;

	public BTNode() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}

	public BTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BTNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}

class myBinaryTree {
	private BTNode root;

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

	public BTNode createNode(int data) {
		BTNode new_node = new BTNode(data);
		return new_node;
	}

	@Override
	public String toString() {
		return "myBinaryTree [root=" + root + "]";
	}

	public void levelWiseDisplay(BTNode head) {
		if (head == null) {
			System.out.println("Empty......");
			return;
		}
		BTNode itr = head;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(head);
		while (!q.isEmpty()) {
			itr = q.peek();
			System.out.print(itr.getData() + " ");
			q.poll();
			if (itr.getLeft() != null) {
				q.add(itr.getLeft());
			}
			if (itr.getRight() != null) {
				q.add(itr.getRight());
			}
		}
	}

	public void sumOfAllLeafNode(BTNode head) {
		if (head == null) {
			return;
		}
		int sum = 0;
		BTNode itr = head;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(head);

		while (!q.isEmpty()) {
			itr = q.peek();
			System.out.println(itr.getData() + " ");
			sum += itr.getData();
			q.poll();
			if (itr.getLeft() != null) {
				q.add(itr.getLeft());
			}
			if (itr.getRight() != null) {
				q.add(itr.getRight());
			}
		}
		System.out.println("Sum: " + sum);

	}

	public void levelWiseNonLeaf(BTNode root) {
		if (root == null) {
			System.out.println("Empty....");
			return;
		}
		BTNode itr = root;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(itr);

		while (!q.isEmpty()) {
			itr = q.peek();
			if (itr.getLeft() != null && itr.getRight() != null) {
				System.out.print(itr.getData() + " ");
			}
			q.poll();
			if (itr.getLeft() != null) {
				q.add(itr.getLeft());
			}
			if (itr.getRight() != null) {
				q.add(itr.getRight());
			}
		}
	}

	public void levelWiseLeaf(BTNode root) {
		if (root == null) {
			System.out.println("empty....");
			return;
		}
		BTNode itr = root;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(itr);

		while (!q.isEmpty()) {
			itr = q.peek();
			if (itr.getLeft() == null && itr.getRight() == null) {
				System.out.print(itr.getData() + " ");
			}
			q.poll();
			if (itr.getLeft() != null) {
				q.add(itr.getLeft());
			}
			if (itr.getRight() != null) {
				q.add(itr.getRight());
			}
		}
	}

	public void insertNode(int data) {
		BTNode node = new BTNode(data);
		if (root == null) {
			root = node;
			return;
		}
		BTNode itr = root;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while (!q.isEmpty()) {
			itr = q.poll();
			if (itr.getLeft() == null) {
				itr.setLeft(node);
				return;
			} else {
				q.add(itr.getLeft());
			}

			if (itr.getRight() == null) {
				itr.setRight(node);
				return;
			} else {
				q.add(itr.getRight());
			}
		}
	}

	public boolean compare(myBinaryTree t) {
		if (root == null || t.getRoot() == null) {
			return false;
		}
		BTNode itr1 = root;
		BTNode itr2 = t.getRoot();

		Queue<BTNode> q1 = new LinkedList<BTNode>();
		Queue<BTNode> q2 = new LinkedList<BTNode>();

		q1.add(itr1);
		q2.add(itr2);
		while ((!q1.isEmpty()) && (!q2.isEmpty())) {
			itr1 = q1.remove();
			itr2 = q2.remove();

			if (itr1.getData() != itr2.getData()) {
				return false;
			}

			if (itr1.getLeft() != null) {
				q1.add(itr1.getLeft());
			}
			if (itr1.getRight() != null) {
				q1.add(itr1.getRight());
			}

			if (itr2.getLeft() != null) {
				q2.add(itr2.getLeft());
			}
			if (itr2.getRight() != null) {
				q2.add(itr2.getRight());
			}
		}

		if (q1.isEmpty() == q2.isEmpty()) {
			return true;
		}
		return false;
	}
}

public class BinaryTMain {

	public static void main(String[] args) {
		myBinaryTree t = new myBinaryTree();
		t.setRoot(t.createNode(55));
		t.getRoot().setLeft(t.createNode(45));
		t.getRoot().setRight(t.createNode(66));
		t.getRoot().getLeft().setLeft(t.createNode(32));
		t.getRoot().getLeft().setRight(t.createNode(12));
		t.getRoot().getRight().setLeft(t.createNode(7));
		t.getRoot().getRight().setRight(t.createNode(8));

		myBinaryTree t2 = new myBinaryTree();
		t2.insertNode(55);
		t2.insertNode(45);
		t2.insertNode(66);
		t2.insertNode(32);
		t2.insertNode(12);
		t2.insertNode(7);
		t2.insertNode(8);

		System.out.println(t);
		System.out.println();
		System.out.println(t2);
		
		System.out.println();
		System.out.println(t.compare(t2));
//		t.levelWiseDisplay(t.getRoot());
//		t.sumOfAllLeafNode(t.getRoot());
//		t.levelWiseNonLeaf(t.getRoot());
//		t.levelWiseLeaf(t.getRoot());

	}
}
