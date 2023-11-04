package com.sunbeam;

public class DisplayRevLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	private Node head;

	public DisplayRevLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else if (pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}

	public void displayList() {
		Node trav = head;
		System.out.print("List : \n");
		while (trav != null) {
			System.out.print(trav.data+"\t" );
			trav = trav.next;
		}
		System.out.println("");
	}

	public void DisplayRevList(Node trav) {
		if (trav == null)
			return;
		DisplayRevList(trav.next);
		System.out.print(trav.data+"\t");
	}

	public void DisplayRevList() {
		System.out.println("Rev List : ");
		DisplayRevList(head);
	}
}
