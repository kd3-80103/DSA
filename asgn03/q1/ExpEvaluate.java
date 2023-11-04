package com.sunbeam;

public class ExpEvaluate {
	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int postfixEvaluate(String postfix) {
		Stack st = new Stack(30);

		String[] tokens = postfix.split("\\+");
		for (String token : tokens) {
			char firstChar = token.charAt(0);
			if (Character.isDigit(firstChar)) {
				st.push(Integer.parseInt(token));
			} else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, firstChar, op2);
				st.push(res);
			}
		}
		if (!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}

	public static int prefixEvaluate(String prefix) {
		Stack st = new Stack(30);

		String[] tokens = prefix.split("\\+");
		for (int i = tokens.length - 1; i >= 0; i--) {
			char firstChar = tokens[i].charAt(0);
			if (Character.isDigit(firstChar)) {
				st.push(Integer.parseInt(tokens[i]));
			} else {
				int op1 = st.pop();
				int op2 = st.pop();
				int res = calculate(op1, firstChar, op2);
				st.push(res);
			}
		}
		if (!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);

		String prefix = "-++4/*56397";
		System.out.println("Prefix : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);
	}
}
