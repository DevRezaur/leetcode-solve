class Solution {

	public int[] twoSum(int[] numbers, int target) {
		int ans[] = new int[2];
		int length = numbers.length;
		int x = 0;
		int y = length - 1;

		while (x < y) {
			int sum = numbers[x] + numbers[y];
			if (sum == target) {
				ans[0] = x + 1;
				ans[1] = y + 1;
				break;
			} else if (sum > target) {
				y--;
			} else {
				x++;
			}
		}

		return ans;
	}

}
