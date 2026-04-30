package dsa.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class BTNode {
	private int data;
	private BTNode left, right;

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

	public void setData(int d) {
		data = d;
		return;
	}

	public void setLeft(BTNode l) {
		left = l;
		return;
	}

	public void setRight(BTNode rt) {
		right = rt;
		return;
	}

	public int getData() {
		return data;
	}

	public BTNode getLeft() {
		return left;
	}

	public BTNode getRight() {
		return right;
	}

}

class MyBinaryTree {

	private BTNode root;

	public MyBinaryTree() {
		root = null;
	}

	public void setRoot(BTNode root) {
		this.root = root;
		return;
	}

	public BTNode getRoot() {
		return root;
	}

	public BTNode createNode(int d) {
		BTNode node = new BTNode(d);
		return node;
	}

	private void visitPreOrder(BTNode r) {
		if (r == null) {
			return;
		}
		System.out.print(r.getData() + " ");
		visitPreOrder(r.getLeft());
		visitPreOrder(r.getRight());
	}

	public void PreOrder() {
		System.out.print("PreOrder: ");
		visitPreOrder(root);
	}

	private void visitInOrder(BTNode r) {
		if (r == null) {
			return;
		}
		visitInOrder(r.getLeft());
		System.out.print(r.getData() + " ");
		visitInOrder(r.getRight());
	}

	public void InOrder() {
		System.out.print("InOrder: ");
		visitInOrder(root);
	}

	private void visitPostOrder(BTNode r) {
		if (r == null) {
			return;
		}
		visitPostOrder(r.getLeft());
		visitPostOrder(r.getRight());
		System.out.print(r.getData() + " ");
	}

	public void PostOrder() {
		System.out.print("PostOrder: ");
		visitPostOrder(root);
	}

	public void displayLevelWise() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		BTNode temp;
		System.out.print("Levelwise: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			System.out.print(temp.getData() + " ");
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
	}

	public void displayLevelWiseLeaf() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		BTNode temp;
		System.out.print("LevelwiseLeaf: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				System.out.print(temp.getData() + " ");
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
	}

	public void displayLevelWiseNonLeaf() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		BTNode temp;
		System.out.print("LevelwiseNonLeaf: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() != null && temp.getRight() != null) {
				System.out.print(temp.getData() + " ");
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
	}

	public int displayLevelWiseNonLeafSum() {
		int sum = 0;
		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		BTNode temp;
		System.out.print("LevelwiseNonLeafSum: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() != null && temp.getRight() != null) {
				sum += temp.getData();
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return sum;
	}

	public int displayLevelWiseLeafSum() {
		int sum = 0;
		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		BTNode temp;
		System.out.print("LevelwiseLeafSum: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				sum += temp.getData();
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return sum;
	}

	public int displayLevelWiseLeafMax() {

		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		int max = root.getData();
		BTNode temp;
		System.out.print("LevelwiseLeafMax: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				if (max < temp.getData()) {
					max = temp.getData();
				}
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return max;
	}

	public int displayLevelWiseLeafMin() {

		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		int min = root.getData();
		BTNode temp;
		System.out.print("LevelwiseLeafMin: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				if (min > temp.getData()) {
					min = temp.getData();
				}
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return min;
	}
	
	
	public void displayLevelWiseMaxMin() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		int max = root.getData();
		int min = root.getData();
		BTNode temp;
		System.out.print("Levelwise: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if(max < temp.getData())
			{
				max = temp.getData();
			}
			if(min > temp.getData())
			{
				min = temp.getData();
			}
			if (temp.getLeft() != null) 
			{
				q.offer(temp.getLeft());
			} 
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}

}

public class BinaryTreeDemo {
	public static void main(String[] args) {
		MyBinaryTree bt = new MyBinaryTree();
		bt.setRoot(bt.createNode(50));

		bt.getRoot().setLeft(bt.createNode(17));
		bt.getRoot().setRight(bt.createNode(72));

		bt.getRoot().getLeft().setLeft(bt.createNode(12));
		bt.getRoot().getLeft().setRight(bt.createNode(23));

		bt.getRoot().getRight().setLeft(bt.createNode(54));
		bt.getRoot().getRight().setRight(bt.createNode(76));

		bt.getRoot().getLeft().getLeft().setLeft(bt.createNode(9));
		bt.getRoot().getLeft().getLeft().setRight(bt.createNode(14));

		bt.getRoot().getLeft().getRight().setLeft(bt.createNode(19));
		bt.getRoot().getRight().getLeft().setRight(bt.createNode(67));

//		bt.PreOrder();
//		System.out.println();
//		bt.InOrder();
//		System.out.println();
//		bt.PostOrder();
		bt.displayLevelWise();
		System.out.println();
		bt.displayLevelWiseLeaf();
		System.out.println();
		bt.displayLevelWiseNonLeaf();
		System.out.println();
		System.out.println(bt.displayLevelWiseNonLeafSum());
		System.out.println(bt.displayLevelWiseLeafSum());

		System.out.println(bt.displayLevelWiseLeafMax());
		System.out.println(bt.displayLevelWiseLeafMin());
		System.out.println();
		bt.displayLevelWiseMaxMin();

	}
}
