import java.util.ArrayList;
import java.util.List;

class Solution {

	public List<String> buildArray(int[] target, int n) {
		List<String> ans = new ArrayList<String>();
		int max = target[target.length - 1];
		int idx = 0;

		for (int i = 1; i <= max; i++) {
			if (i == target[idx]) {
				ans.add("Push");
				idx++;
			} else {
				ans.add("Push");
				ans.add("Pop");
			}
		}

		return ans;
	}

}
