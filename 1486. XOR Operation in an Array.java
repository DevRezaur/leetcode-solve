class Solution {

	public int xorOperation(int n, int start) {
		int ans = start + 0;

		for (int i = 1; i < n; i++) {
			ans = ans ^ (start + 2 * i);
		}
		
		return ans;
	}
  
}
