import java.util.ArrayList;
import java.util.List;

class Solution {

	public int calPoints(String[] ops) {
		List<Integer> list = new ArrayList<Integer>();

		for (String s : ops) {
			if (s.equals("D")) {
				list.add(2 * list.get(list.size() - 1));
			} else if (s.equals("C")) {
				list.remove(list.size() - 1);
			} else if (s.equals("+")) {
				list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
			} else {
				list.add(Integer.parseInt(s));
			}
		}

		int total = 0;

		for (int num : list) {
			total += num;
		}

		return total;
	}

}
