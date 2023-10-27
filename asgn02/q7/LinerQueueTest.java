package com.sunbeam;

import java.util.Scanner;

//Write program to implement linear queue in which front and rear starts at 0.
public class LinerQueueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		LinearQueue lq = new LinearQueue(5);
		do {
			System.out.println("0.EXIT\n1.PUSH\n2.POP\n3.PEEK");
			System.out.println("Enter choice = ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (lq.isFull())
					System.out.println("queue is full.");
				else {
					System.out.println("Enter data = ");
					int data = sc.nextInt();
					lq.push(data);
				}
				break;
			case 2:
				if (lq.isEmpty())
					System.out.println("queue is empty.");
				else {
					lq.pop();
				}
				break;
			case 3:
				if (lq.isEmpty())
					System.out.println("queue is empty.");
				else
					System.out.println("peek = "+lq.peek());;
				break;
			}
		} while (choice != 0);

	}

}
