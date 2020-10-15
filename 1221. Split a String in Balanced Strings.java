class Solution {

	public int balancedStringSplit(String s) {
		int result = 0, count = 0;

		for (char ch : s.toCharArray()) {
			if (ch == 'R')
				count++;
			else if (ch == 'L')
				count--;

			if (count == 0) {
				result++;
				count = 0;
			}
		}

		return result;
	}
	
}
