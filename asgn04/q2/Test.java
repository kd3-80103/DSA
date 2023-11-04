package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		BSTAddNodeRecursion bst = new BSTAddNodeRecursion();

		bst.addNode(50);
		bst.addNode(30);
		bst.addNode(80);
		bst.addNode(60);
		bst.addNode(10);
		bst.inOrder();
	}

}
