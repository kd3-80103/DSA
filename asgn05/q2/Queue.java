package com.sunbeam;

public class Queue {

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

	public Queue() {
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
		} while (trav != head);
		System.out.println("");
	}
	
	public void pop() {
		if(isEmpty()) {
			return;
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
		
	}
}
