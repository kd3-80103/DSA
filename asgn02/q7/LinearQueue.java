package com.sunbeam;

public class LinearQueue {
	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;

	public LinearQueue(int size) {
		SIZE = size;
		this.arr = new int[SIZE];
		this.rear = 0;
		this.front = 0;
	}

	public void push(int data) {
		rear++;
		arr[rear] = data;
	}

	public void pop() {
		front++;
	}

	public int peek() {
		return arr[front + 1];
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}

	public boolean isEmpty() {
		return rear == front;
	}

}
