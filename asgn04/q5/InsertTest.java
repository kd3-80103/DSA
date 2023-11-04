package com.sunbeam;

import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		InsertBeforeAfterSLLL i = new InsertBeforeAfterSLLL();
		i.addFirst(10);
		i.addFirst(50);
		i.addFirst(30);
		i.addFirst(40);
		i.addFirst(20);
		i.addFirst(70);
		i.displayList();

		do {
			System.out.println("Enter node/position to add before or after = ");
			int pos = scanner.nextInt();
			System.out.println("1.Add Before given node\n2.Add After given node");
			System.out.println("Enter choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value of a node = ");
				int value = scanner.nextInt();
				i.insertBefore(pos, value);
				i.displayList();
				break;
			case 2:
				System.out.println("Enter value of a node = ");
				int val = scanner.nextInt();
				i.insertAfter(pos, val);
				i.displayList();
				break;
			}
		} while (choice != 0);

	}

}
