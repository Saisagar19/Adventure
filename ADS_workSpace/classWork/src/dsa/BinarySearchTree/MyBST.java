package dsa.BinarySearchTree;

class BTNode {
	private int val;
	private BTNode left, right;

	public BTNode() {
		val = 0;
		left = null;
		right = null;
	}

	public BTNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
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
		return "BTNode [val=" + val + ", left=" + left + ", right=" + right + "]";
	}

}

class BST {
	private BTNode root;

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

	public void insertNonR(int val) {
		BTNode node = new BTNode(val);
		if (root == null) {
			root = node;
			return;
		}
		BTNode iter = root;
		BTNode parent = root;
		while (iter != null) {
			parent = iter;
			if (val < iter.getVal()) {
				iter = iter.getLeft();
			} else if (val > iter.getVal()) {
				iter = iter.getRight();
			} else {
				System.out.println("Duplicate......");
				return;
			}
		}
		if (val < parent.getVal()) {
			parent.setLeft(node);
		} else {
			parent.setRight(node);
		}

		return;

	}
	
	public boolean search(int key)
	{
		if(root == null)
		{
			System.out.println("Empty...");
			return false;
		}
		BTNode iter = root;
		while(iter != null)
		{
			if(iter.getVal() == key)
			{
				return true;
			}
			else if(key < iter.getVal())
			{
				iter = iter.getLeft();
			}
			else
			{
				iter = iter.getRight();
			}
		}
		return false;
	}
	
	public int minBST()
	{
		int min = Integer.MAX_VALUE;
		if(root == null)
		{
			return min;
		}
		BTNode itr = root;
		while(itr != null)
		{
			if(itr.getVal() < min)
			{
				min = itr.getVal();
			}
			itr = itr.getLeft();
	
		}
		return min;	
	}
	
	public int maxBST()
	{
		int max = Integer.MIN_VALUE;
		if(root == null)
		{
			return max;
		}
		BTNode itr = root;
		while(itr != null)
		{
			if(itr.getVal() > max)
			{
				max = itr.getVal();
			}
			itr = itr.getRight();
		}
		return max;
	}

	@Override
	public String toString() {
		return "BST [root=" + root + "]";
	}

}

public class MyBST {
	public static void main(String[] args) {

		BST b = new BST();
		BST b1 = new BST();
		b.insertNonR(45);
		b.insertNonR(55);
		b.insertNonR(41);
		System.out.println(b);
		System.out.println(b.search(45));
		System.out.println(b.search(55));
		System.out.println(b.search(41));
		System.out.println(b.search(99));
		System.out.println(b.search(199));
//		System.out.println(b1.search(0));
		System.out.println(b.minBST());
		System.out.println(b.maxBST());
		
		
		

	}
}
