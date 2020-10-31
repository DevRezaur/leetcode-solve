import java.util.Arrays;

class Solution {

	public int[] kWeakestRows(int[][] mat, int k) {
		int m = mat.length;
		int n = mat[0].length;

		return numberOfOne(mat, n, m, k);
	}

	public int[] numberOfOne(int mat[][], int n, int m, int k) {
		int sums[][] = new int[m][2];

		for (int i = 0; i < m; i++) {
			int left = 0;
			int right = n - 1;

			while (left <= right) {
				int mid = left + (right - left) / 2;

				if (mat[i][mid] > 0)
					left = mid + 1;
				else
					right = mid - 1;
			}
			sums[i][0] = i;
			sums[i][1] = right;
		}

		Arrays.sort(sums, (int[] a, int[] b) -> a[1] < b[1] ? -1 : a[1] > b[1] ? 1 : a[0] < b[0] ? -1 : a[0] > b[0] ? 1 : 0);

		int ans[] = new int[k];

		for (int i = 0; i < k; i++) {
			ans[i] = sums[i][0];
		}

		return ans;
	}

}
