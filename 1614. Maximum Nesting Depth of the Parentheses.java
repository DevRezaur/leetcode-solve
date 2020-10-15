class Solution {

	public int maxDepth(String s) {
		int len = s.length();
		int max = 0, count = 0;

		for (int i = 0; i < len; i++) {
			char x = s.charAt(i);

			if (x == '(') {
				count++;
				if (count > max)
					max = count;
			} else if (x == ')') {
				count--;
			}
		}

		return max;
	}
  
}
