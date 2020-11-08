class Solution {

	public String sortString(String s) {
		int freq[] = new int[26];
		int len = s.length();

		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		StringBuilder str = new StringBuilder();
		int i = 0;
		Boolean isIncreasing = true;

		while (len > 0) {
			if (i >= 0 && i <= 25 && freq[i] > 0) {
				str.append((char) (i + 'a'));
				freq[i]--;
				len--;
			}

			if (isIncreasing) {
				i++;
			} else {
				i--;
			}

			if (i < 0) {
				isIncreasing = true;
			} else if (i > 25) {
				isIncreasing = false;
			}
		}

		return str.toString();
	}
  
}
