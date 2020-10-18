import java.util.HashSet;

class Solution {

	public int numJewelsInStones(String J, String S) {
		HashSet<Character> charSet = new HashSet<Character>();

		for (char c : J.toCharArray()) {
			charSet.add(c);
		}

		int count = 0;

		for (char c : S.toCharArray()) {
			if (charSet.contains(c)) {
				count++;
			}
		}

		return count;
	}
	
}
