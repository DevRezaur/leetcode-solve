class Solution {

	public int sumOddLengthSubarrays(int[] arr) {
		int len = arr.length;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j += 2) {
				int k = i;

				while (k <= j) {
					sum += arr[k++];
				}
			}
		}

		return sum;
	}
  
}
