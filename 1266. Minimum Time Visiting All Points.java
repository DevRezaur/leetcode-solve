class Solution {

	public int minTimeToVisitAllPoints(int[][] points) {
		int len = points.length;
		int ans = 0;

		for (int i = 0; i < len - 1; i++) {
			int x = Math.abs(points[i + 1][0] - points[i][0]);
			int y = Math.abs(points[i + 1][1] - points[i][1]);

			ans += x > y ? x : y;
		}

		return ans;
	}
  
}
