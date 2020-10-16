class Solution {

	public int maximum69Number(int num) {
		int digit = (int) Math.log10(num);

		for (int i = digit; i >= 0; i--) {
			int n = (int) (num / Math.pow(10, i));
			n %= 10;

			if (n == 6) {
				return (int) (num + 3 * Math.pow(10, i));
			}
		}

		return num;
	}

}
