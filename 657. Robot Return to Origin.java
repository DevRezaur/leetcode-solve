class Solution {

	public boolean judgeCircle(String moves) {
		int R = 0;
		int L = 0;
		int U = 0;
		int D = 0;

		for (char move : moves.toCharArray()) {
			if (move == 'R') {
				R++;
			} else if (move == 'L') {
				L++;
			} else if (move == 'U') {
				U++;
			} else if (move == 'D') {
				D++;
			}
		}

		if (R == L && U == D)
			return true;

		return false;
	}
  
}
