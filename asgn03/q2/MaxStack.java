package com.sunbeam;

import java.util.Scanner;
import java.util.Stack;

public class MaxStack {

	int menu() {
		int choice;
		System.out.println("*****************");
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Show max");
		System.out.println("Enter choice: ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		int choice;
		int key = 0;
		Scanner sc = new Scanner(System.in);
		MaxStack m = new MaxStack();
		while (true) {
			choice = m.menu();
			switch (choice) {
			case 1:
				if (Stack.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
					if (data > key) {
						key = data;
					}
				}
				break;
			case 2:
				if (st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped Data = " + st.pop());
				break;
			case 3:
				if (st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked Data = " + st.peek());
				break;
			case 4:
				System.out.println("Max element:" + key);
				break;
			}

			sc.close();
		}
	}
}
