package com.sunbeam;

public class MaxMinValue {
	private class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public MaxMinValue() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public int findMax() {
		if (isEmpty()) {
			System.out.println("List is empty..");
			return Integer.MIN_VALUE;
		}

		int max = head.data;
		Node trav = head.next;

		while (trav != null) {
			if (trav.data > max) {
				max = trav.data;
			}
			trav = trav.next;
		}
		return max;
	}

	public int findMin() {
		if (isEmpty()) {
			System.out.println("List is empty..");
			return Integer.MAX_VALUE;
		}
		int min = head.data;
		Node trav = head.next;

		while (trav != null) {
			if (trav.data < min) {
				min = trav.data;
			}
			trav = trav.next;
		}
		return min;
	}

	public void display() {
		Node trav = head;
		
		while (trav != null) {
			System.out.print(trav.data+" ");
			trav = trav.next;
		}
		System.out.println("");
	}
}
