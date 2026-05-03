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
	
	
	private BTNode inserRec(BTNode ptr, int data)
	{
		if(ptr == null)
		{
			ptr = new BTNode(data); 
		}
		
		if(data < ptr.getVal())
		{
			ptr.setLeft(inserRec(ptr.getLeft(), data));
		}
		else if(data > ptr.getVal())
		{
			ptr.setRight(inserRec(ptr.getRight(), data));
		}
		return ptr;
		
	}
	
	public void insertR(int data)
	{
		root = inserRec(root, data);
	}
	
	private BTNode searchRec(int key, BTNode ptr)
	{
		if(ptr == null)
		{
			return null;
		}
		if(ptr.getVal() == key)
		{
			return ptr;
		}
		
		if(key < ptr.getVal())
		{
			return searchRec(key, ptr.getLeft());
		}
		else if(key > ptr.getVal())
		{
			return searchRec(key, ptr.getRight());
		}
		return ptr;
	}
	
	public BTNode SearchR(int k)
	{
		root = searchRec(k, root);
		return root;
	}
	
	public  int heightBST(BTNode ptr)
	{
		int left = 0;
		int right = 0;
		if(ptr == null)
		{
			return 0;
		}
		
		if(ptr.getLeft() != null)
		{
			left = heightBST(ptr.getLeft());
		}
		if(ptr.getRight() != null)
		{
			right = heightBST(ptr.getRight());
		}
		
		if(left > right)
		{
			return left + 1;
		}
		else
		{
			return right +1;
		}
	}

	@Override
	public String toString() {
		return "BST [root=" + root + "]";
	}

}

public class MyBST {
	public static void main(String[] args) {

		BST b = new BST();
//		BST b1 = new BST();
//		b.insertNonR(45);
//		b.insertNonR(55);
//		b.insertNonR(41);
		b.insertR(45);
		b.insertR(55);
		b.insertR(49);
		
		BTNode root = new BTNode(1);
		root.setLeft(new BTNode(2));
		root.setRight(new BTNode(3));
		root.getLeft().setLeft(new BTNode(4));
		
		System.out.println(b);
//		System.out.println(b.search(45));
//		System.out.println(b.search(55));
//		System.out.println(b.search(41));
//		System.out.println(b.search(99));
//		System.out.println(b.search(199));
//		System.out.println(b1.search(0));
		System.out.println(b.minBST());
		System.out.println(b.maxBST());
		BTNode r = b.SearchR(45);
		System.out.println(r);
		System.out.println(root);
		
		System.out.println(b.heightBST(root));
		
		
	}
}
