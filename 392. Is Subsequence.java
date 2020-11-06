class Solution {

	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0)
			return true;

		int x = 0;

		for (char c : t.toCharArray()) {
			if (s.charAt(x) == c) {
				x++;
			}

			if (x == s.length())
				return true;
		}

		return false;
	}

}
