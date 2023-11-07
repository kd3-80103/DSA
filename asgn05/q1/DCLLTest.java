package com.sunbeam;

public class DCLLTest {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(25);
		l.addFirst(10);
		l.addFirst(30);
		l.addFirst(50);
		l.addFirst(40);
		l.addPosition(2, 55);
		//l.deleteFirst();
		l.deletePosition(1);
		l.display();
	}
}
