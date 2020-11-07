import java.util.Stack;

class Solution {

	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();

		for (char c : S.toCharArray()) {
			if (stack.empty()) {
				stack.push(c);
			} else if (c == stack.peek()) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		StringBuilder ans = new StringBuilder();

		while (!stack.isEmpty()) {
			ans.append(stack.pop());
		}

		return ans.reverse().toString();
	}
	
}
