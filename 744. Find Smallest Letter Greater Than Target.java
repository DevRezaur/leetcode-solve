class Solution {

	public char nextGreatestLetter(char[] letters, char target) {
		int length = letters.length;

		if (target >= letters[length - 1])
			return letters[0];

		int left = 0;
		int right = length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (target == letters[mid] && letters[mid] != letters[mid + 1]) {
				return letters[mid + 1];
			} else if (target < letters[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return letters[left];
	}

}
