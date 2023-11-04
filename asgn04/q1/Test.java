package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		
		ll.addLast(10);
		ll.addLast(45);
		ll.addLast(75);
		ll.addLast(60);
		ll.addLast(15);
		ll.deleteLast();
		ll.display();
	}

}
