class Solution {

	public int numWaterBottles(int numBottles, int numExchange) {
		int count = 0;
		int numEmpty = 0;

		while (numBottles != 0) {
			count += numBottles;
			numEmpty += numBottles;
			numBottles = numEmpty / numExchange;
			numEmpty = numEmpty % numExchange;
		}

		return count;
	}
  
}
