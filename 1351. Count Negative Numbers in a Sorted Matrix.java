class Solution {

	public int countNegatives(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int count = 0;

		for (int i = 0; i < m; i++) {
			int negIndex = firstNegNumberIndex(grid, i, n);
			count = count + (n - negIndex);
		}

		return count;
	}

	public int firstNegNumberIndex(int grid[][], int m, int n) {
		int left = 0;
		int right = n - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (grid[m][mid] < 0)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return left;
	}

}
