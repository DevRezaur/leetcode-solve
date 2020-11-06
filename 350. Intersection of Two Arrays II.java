import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

	public int[] intersect(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int x = 0;
		int y = 0;

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		List<Integer> list = new ArrayList<>();

		while (x < length1 && y < length2) {
			if (nums1[x] == nums2[y]) {
				list.add(nums1[x]);
				x++;
				y++;
			} else if (nums1[x] > nums2[y]) {
				y++;
			} else {
				x++;
			}
		}

		int ans[] = new int[list.size()];
		int index = 0;

		for (int i : list) {
			ans[index++] = i;
		}

		return ans;
	}

}
