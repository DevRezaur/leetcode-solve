import java.util.HashMap;

class Solution {

	public int repeatedNTimes(int[] A) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int num : A) {
			if (hash.containsKey(num))
				hash.put(num, hash.get(num) + 1);
			else
				hash.put(num, 1);
		}

		for (int key : hash.keySet()) {
			if (hash.get(key) > 1)
				return key;
		}

		throw null;
	}

}
