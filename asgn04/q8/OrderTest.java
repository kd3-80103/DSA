package com.sunbeam;

public class OrderTest {

	public static void main(String[] args) {
		LinkedList i = new LinkedList();
		i.insertSorted(80);
		i.insertSorted(70);
		i.insertSorted(60);
		i.insertSorted(50);
		i.insertSorted(10);
		i.insertSorted(30);
		i.insertSorted(20);
		i.insertSorted(40);
		
		System.out.println("Sorted list :");
		i.display();
	}

}
