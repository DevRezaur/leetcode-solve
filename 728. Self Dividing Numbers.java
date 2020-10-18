import java.util.ArrayList;
import java.util.List;

class Solution {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> ans = new ArrayList<Integer>();

		for (int i = left; i <= right; i++) {
			Boolean flag = false;
			int j = i;

			while (j != 0) {
				int rem = j % 10;
				j = j / 10;

				if (rem == 0) {
					flag = true;
					break;
				} else {
					if (i % rem != 0) {
						flag = true;
						break;
					}
				}
			}
			if (flag == false) {
				ans.add(i);
			}
		}

		return ans;
	}

}
