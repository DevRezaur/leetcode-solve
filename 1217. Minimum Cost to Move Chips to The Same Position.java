class Solution {

	public int minCostToMoveChips(int[] position) {
		int evenCount = 0;

		for (int pos : position) {
			if (pos % 2 == 0)
				evenCount++;
		}

		return evenCount > (position.length - evenCount) ? (position.length - evenCount) : evenCount;
	}
  
}
