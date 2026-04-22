package java1.strings;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "{[()]}";
		String input2 = "([)]";
		String input3 = "((())";
		String input4 = "{a+[b*(c+d)]}";

		System.out.println(input1 + " - > " + isBalanced(input1));
		System.out.println(input2 + " - > " + isBalanced(input2));
		System.out.println(input3 + " - > " + isBalanced(input3));
		System.out.println(input4 + " - > " + isBalanced(input4));
	}

	private static Boolean isBalanced(String input) {

		Stack<Character> stack = new Stack<Character>();

		for (char ch : input.toCharArray()) {

			// Push opening brackets
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				// Handle closing brackets
			} else if (ch == ')' || ch == '}' || ch == ']') {
				// Case 1: stack empty → unmatched closing
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				// Case 2: mismatch (round vs square, etc.)
				if (	ch == ')' && top != '(' || 
						ch == '}' && top != '{' || 
						ch == ']' && top != '[') {
					return false;
				}

			}

		}
		// Case 3: stack not empty → missing closing
		return stack.isEmpty();
	}

}
