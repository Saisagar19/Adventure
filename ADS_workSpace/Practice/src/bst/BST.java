package bst;

import java.util.LinkedList;
import java.util.Queue;

class BSTNode {
	private int data;
	private BSTNode left;
	private BSTNode right;

	public BSTNode() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}

	public BSTNode(int data) {
		super();
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

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BSTNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}

class MyBST {
	private BSTNode root;

	public BSTNode getRoot() {
		return root;
	}

	@Override
	public String toString() {
		return "MyBST [root=" + root + "]";
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}

	public BSTNode createNode(int data) {
		BSTNode node = new BSTNode(data);
		return node;
	}

	public void insertNon(int data) {
		BSTNode node = new BSTNode(data);
		if (root == null) {
			root = node;
			return;
		}

		BSTNode itr = root;
		BSTNode parent = root;
		while (itr != null) {
			parent = itr;
			if (data < itr.getData()) {
				itr = itr.getLeft();
			} else if (data > itr.getData()) {
				itr = itr.getRight();
			} else {
				System.out.println("Duplicate");
				return;
			}

		}
		if (data < parent.getData()) {
			parent.setLeft(node);
		} else {
			parent.setRight(node);
		}
	}

	public void levelWiseDisplay(BSTNode root) {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		BSTNode itr = root;
		Queue<BSTNode> q1 = new LinkedList<BSTNode>();
		q1.add(root);

		while (!q1.isEmpty()) {
			itr = q1.peek();
			System.out.print(itr.getData() + " ");
			q1.remove();

			if (itr.getLeft() != null) {
				q1.add(itr.getLeft());
			}
			if (itr.getRight() != null) {
				q1.add(itr.getRight());
			}
		}

	}

	public boolean search(int data) {
		if (root == null) {
			return false;
		}
		BSTNode itr = root;
		while (itr != null) {
			if (itr.getData() == data) {
				return true;
			} else if (data < root.getData()) {
				itr = itr.getLeft();
			} else if(data > root.getData()){
				itr = itr.getRight();
			}
		}
		return false;

	}

}

public class BST {
	public static void main(String[] args) {
		MyBST t1 = new MyBST();
		t1.insertNon(55);
		t1.insertNon(12);
		t1.insertNon(65);

//		System.out.println(t1);
		t1.levelWiseDisplay(t1.getRoot());
		System.out.println(t1.search(12));
	}

}
