class Solution {

	public String removeOuterParentheses(String S) {
		String ans = "";
		int count = 0;

		for (char c : S.toCharArray()) {
			if (c == '(')
				count++;

			if (count > 1)
				ans = ans + c;

			if (c == ')')
				count--;
		}

		return ans;
	}

}
