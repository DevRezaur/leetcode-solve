class Solution {

	public int oddCells(int n, int m, int[][] indices) {
		int[] row = new int[n];
		int[] col = new int[m];

		for (int[] indice : indices) {
			row[indice[0]]++;
			col[indice[1]]++;
		}

		int oddRow = 0;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (row[i] % 2 != 0) {
				oddRow++;
				ans += m;
			}
		}

		for (int i = 0; i < m; i++) {
			if (col[i] % 2 != 0) {
				ans -= oddRow;
				ans += n - oddRow;
			}
		}

		return ans;
	}
  
}
