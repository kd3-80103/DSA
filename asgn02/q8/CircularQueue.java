package com.sunbeam;

public class CircularQueue {

	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;

	public CircularQueue(int SIZE) {

		this.SIZE = SIZE;
		arr = new int[SIZE];
		rear = -1;
		front = -1;
	}

	public void push(int data) {
		rear = (rear + 1) % SIZE - 1;
		arr[rear] = data;
	}

	public void pop() {
		front = (front + 1) % SIZE;
		if (front == rear) {
			front = -1;
			rear = -1;
		}
	}

	public int peek() {
		return arr[(front + 1) % SIZE];
	}
	
	

}
