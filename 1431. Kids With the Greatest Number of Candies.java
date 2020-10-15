import java.util.ArrayList;
import java.util.List;

class Solution {

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int len = candies.length;

		List<Boolean> result = new ArrayList<Boolean>();

		int max = -1;

		for (int i = 0; i < len; i++) {
			if (candies[i] > max)
				max = candies[i];
		}

		for (int i = 0; i < len; i++) {
			if (candies[i] + extraCandies >= max)
				result.add(true);
			else
				result.add(false);
		}

		return result;
	}

}
