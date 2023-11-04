package com.subeam;

import java.util.Scanner;

public class DescStackT {
	int menu() {
		int choice;
		System.out.println("*****************");
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("Enter choice: ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		DescStackT m = new DescStackT();
		DescStack st = new DescStack(4);
		while (true) {
			choice = m.menu();
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				if (st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
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
			}
		}
	}
}
