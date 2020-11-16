class Solution {

	public int diagonalSum(int[][] mat) {
		int len = mat.length;
		int x = 0;
		int y = len - 1;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			sum += mat[i][x];
			sum += x != y ? mat[i][y] : 0;
			x++;
			y--;
		}

		return sum;
	}
  
}
