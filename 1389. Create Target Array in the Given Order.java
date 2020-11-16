import java.util.ArrayList;
import java.util.List;

class Solution {

	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<>();

		int idx = 0;
		for (int num : nums) {
			list.add(index[idx++], num);
		}

		int ans[] = new int[list.size()];

		idx = 0;
		for (int l : list) {
			ans[idx++] = l;
		}

		return ans;
	}
  
}
