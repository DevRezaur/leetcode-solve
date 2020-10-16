class Solution {

	public int subtractProductAndSum(int n) {
		if (n < 10)
			return 0;

		int product = 1, sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			product *= rem;
			n = n / 10;
		}

		return product - sum;
	}
	
}
