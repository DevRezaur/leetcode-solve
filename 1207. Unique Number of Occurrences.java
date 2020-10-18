import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {

	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> hash = new HashMap<>();

		for (int num : arr) {
			hash.put(num, hash.getOrDefault(num, 0) + 1);
		}

		HashSet<Integer> set = new HashSet<Integer>();

		for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
			if (set.contains(entry.getValue()))
				return false;
			else
				set.add(entry.getValue());
		}

		return true;
	}

}
