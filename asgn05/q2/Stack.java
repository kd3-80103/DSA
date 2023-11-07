package com.sunbeam;

public class Stack {
	public class Node {
		private int data;
		private Node prev;
		private Node next;

		public Node(int value) {
			data = value;
			prev = null;
			next = null;
		}
	}

	private Node head;

	public Stack() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int value) {
		Node nn = new Node(value);

		if (isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		} else {
			nn.prev = head.prev;
			nn.next = head;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != head );
		System.out.println("");
	}
	
	public void pop() {
		// 1. if list is empty
		if (isEmpty())
			return;
		// 2. if has single node
		else if (head.next == head)
			head = null;
		// 3. if list has multiple nodes
		else {
			// a. add second node into next of last node
			head.prev.next = head.next;
			// b. add last node into prev of second node
			head.next.prev = head.prev;
			// c. move head on second node
			head = head.next;
		}
	}
}

//1. create node
//2. if list is empty
//a. add newnode into head
//b. make list circular
//3. if list is not empty
//a. add first node into next of newnode
//b. add last node into prev of newnode
//c. add newnode into next of last node
//d. add newnode into prev of first node
//e. move head on newnode