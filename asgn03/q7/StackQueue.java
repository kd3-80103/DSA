package com.sunbeam;

public class StackQueue {
	private Stack stack1;
    private Stack stack2;

    public StackQueue(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
    	StackQueue queue = new StackQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued element: " + queue.dequeue()); 
        System.out.println("Dequeued element: " + queue.dequeue()); 
        System.out.println("Is queue empty: " + queue.isEmpty()); 

        System.out.println("Dequeued element: " + queue.dequeue()); 
    }
}
