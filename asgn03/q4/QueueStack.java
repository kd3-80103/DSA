package com.sunbeam;

public class QueueStack {

	private Queue queue;

	public QueueStack(int size) {
		queue = new Queue();
	}

	public void push(int data) {
		if (queue.isFull()) {
			System.out.println("Stack is full. Cannot push element: " + data);
		} else {
			queue.push(data);
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
		} else {
			while (queue.peek() != queue.rear) {
				queue.pop();
			}
			queue.pop();
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		} else {
			int topElement = queue.peek();
			while (queue.peek() != queue.rear) {
				queue.pop();
			}
			queue.push(topElement);
			return topElement;
		}
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public static void main(String[] args) {
		QueueStack qs = new QueueStack(5);
		qs.push(1);
		qs.push(2);
		qs.push(3);

		System.out.println("Top element: " + qs.peek());
		qs.pop();
		System.out.println("Top element after pop: " + qs.peek());
	}

}
