package com.sunbeam;

public class DisplayRevTest {

	public static void main(String[] args) {
		DisplayRevLinkedList li=new DisplayRevLinkedList();
		li.addFirst(12);
		li.addLast(23);
		li.addPosition(40,3);
		li.displayList();
		li.DisplayRevList();
	}

}
