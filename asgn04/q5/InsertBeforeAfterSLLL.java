package com.sunbeam;

public class InsertBeforeAfterSLLL {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public InsertBeforeAfterSLLL() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
	}

	public void insertBefore(int pos, int value) {
		Node nn = new Node(value);
		Node trav = head;
		if (isEmpty()) {
			head = nn;
		} else {
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			nn.next = trav.next;
			trav.next = nn;
		}
	}

	public void insertAfter(int pos, int value) {
		Node nn = new Node(value);
		Node trav = head;
		if (isEmpty()) {
			head = nn;
		} else {
			for (int i = 1; i < pos && trav.next != null; i++)
				trav = trav.next;
			nn.next = trav.next;
			trav.next = nn;
		}
	}

	public void displayList() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
}
