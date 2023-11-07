package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println("****STACK****");
		s.push(20);
		s.push(40);
		s.push(10);
		s.push(80);
		s.pop();
		s.display();
		
		System.out.println("\n****QUEUE****");
		
		Queue q= new Queue();
		q.push(25);
		q.push(45);
		q.push(65);
		q.push(75);
		q.pop();
		q.display();
	}

}
