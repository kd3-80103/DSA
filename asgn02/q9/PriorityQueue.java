package com.sunbeam;

public class PriorityQueue {
	public static int prio(char opr) {
		switch (opr) {
		case '$':
			return 10;
		case '*':
			return 9;
		case '/':
			return 9;
		case '%':
			return 9;
		case '+':
			return 8;
		case '-':
			return 8;
		}
		return 0;
	}
	public static void main(String[] args) {
		if (prio('$') >= prio('-'))
			System.out.println("First Operator have Higher Priority.");
		else
			System.out.println("Second Operator have Higher Priority.");

	}

}
