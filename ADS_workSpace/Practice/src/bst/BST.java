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
			} else if (data > root.getData()) {
				itr = itr.getRight();
			}
		}
		return false;

	}

	private boolean searchRec(BSTNode root, int data) {
		if (root == null) {
			return false;
		}

		if (data < root.getData()) {
			return searchRec(root.getLeft(), data);
		} else if (data > root.getData()) {
			return searchRec(root.getRight(), data);
		}
		return true;
	}
	public boolean search_Rec(int d)
	{
		if(searchRec(root, d))
		{
			return true;
		}
		return false;
	}

	private BSTNode insertRec(BSTNode root, int data) {
		BSTNode new_node = new BSTNode(data);
		if (root == null) {
			root = new_node;
		}
		else if (data < root.getData()) 
		{
			root.setLeft(insertRec(root.getLeft(), data));
		} 
		else if (data > root.getData()) 
		{
			root.setRight(insertRec(root.getRight(), data));
		}

		return root;
	}
	
	public void insert_Rec(int data)
	{
		root = insertRec(root, data);
	}
	
	private int find_height(BSTNode root)
	{
		int left = 0;
		int right = 0;
		if(root == null)
		{
			return 0;
		}
		if(root.getLeft() != null)
		{
			left = find_height(root.getLeft());
		}
		if(root.getRight() != null)
		{
			right = find_height(root.getRight());
		}
		
		return 1 + Math.max(left, right);
	}
	
	public void height()
	{
		System.out.println(find_height(root));
	}

}

public class BST {
	public static void main(String[] args) {
		MyBST t1 = new MyBST();
//		t1.insertNon(55);
//		t1.insertNon(12);
//		t1.insertNon(65);
//		t1.insert_Rec(64);
//		t1.insert_Rec(55);
//		t1.insert_Rec(96);
		t1.insert_Rec(8);
		t1.insert_Rec(3);
		t1.insert_Rec(10);
		t1.insert_Rec(1);
		t1.insert_Rec(6);
		t1.insert_Rec(4);
		t1.insert_Rec(7);
		t1.insert_Rec(14);
		t1.insert_Rec(13);

		t1.height();
//		System.out.println(t1);
//		System.out.println(t1.search_Rec(89));
		
//		t1.levelWiseDisplay(t1.getRoot());
//		System.out.println(t1.search(12));
//		System.out.println(t1.searchRec(t1.getRoot(), 69));
	}

}
