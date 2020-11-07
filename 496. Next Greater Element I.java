import java.util.HashMap;
import java.util.Map;

class Solution {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int len1 = nums1.length;
		int len2 = nums2.length;

		for (int i = 0; i < len2; i++) {
			map.put(nums2[i], -1);

			for (int j = i + 1; j < len2; j++) {
				if (nums2[j] > nums2[i]) {
					map.put(nums2[i], nums2[j]);
					break;
				}
			}
		}

		int ans[] = new int[len1];

		for (int i = 0; i < len1; i++) {
			ans[i] = map.get(nums1[i]);
		}

		return ans;
	}

}
