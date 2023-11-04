package com.sunbeam;

public class BSTAddNodeRecursion {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BSTAddNodeRecursion() {
		root = null;
	}
	
	public BSTAddNodeRecursion(int value) {
		root = new Node(value);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		root = addNode(root, value);
	}
	
	private Node addNode(Node root, int value) {

		if (isEmpty()) {
			root = new Node(value);
			return root;
		} else if (value < root.data) {
			root.left = addNode(root.left, value);
		} else if (value > root.data) {
			root.right = addNode(root.right, value);
		}
		return root;
	}

	private void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.println(trav.data + "");
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("INORDER : ");
		inOrder(root);
		System.out.println("");
	}
}
