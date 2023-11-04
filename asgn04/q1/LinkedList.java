package com.sunbeam;

public class LinkedList {
	class  Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	private Node tail;
	public LinkedList() {
		head = null;
		tail = null;
	}
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			head = nn;
			tail = nn;
		}else {
			tail.next = nn;
			tail = nn;
		}
	}
	
	public void display() {
		Node trav = head;
		while(trav != null) {
			System.out.print(" "+trav.data+" ");	
			trav= trav.next;
		}
		System.out.println("");
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is empty.");
		}
		else if(head.next == null) {
			head = null;
		}else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
		}
	}
	
}
