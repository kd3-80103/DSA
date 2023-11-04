package com.sunbeam;

public class SinglyLinearList {
	private class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private int size;

	public SinglyLinearList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addNode(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void bubbleSort() {
		Node trav = head, index = null;

		if (head == null)
			return;
		else {
			while (trav != null) {
				index = trav.next;

				while (index != null) {

					if (trav.data > index.data) {

						int temp = trav.data;
						trav.data = index.data;
						index.data = temp;

					}
					index = index.next;

				}
				trav = trav.next;
			}
		}
	}

	public void display() {
		Node trav = head;

		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;

		}
		System.out.println(" ");
	}
}
