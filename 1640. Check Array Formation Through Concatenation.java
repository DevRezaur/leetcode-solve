import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

	public boolean canFormArray(int[] arr, int[][] pieces) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int len1 = arr.length;

		for (int i = 0; i < len1; i++) {
			map.put(arr[i], i);
		}

		for (int piece[] : pieces) {
			int len2 = piece.length;
			int i = 0;

			while (i < len2) {
				if (!map.containsKey(piece[i])) {
					return false;
				} else if (i + 1 < len2 && !map.containsKey(piece[i + 1])) {
					return false;
				} else if (i + 1 < len2 && map.get(piece[i + 1]) - map.get(piece[i]) != 1) {
					return false;
				} else {
					list.add(piece[i]);
					i++;
				}
			}
		}

		if (list.size() != len1)
			return false;

		return true;
	}
  
}
