import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {

	public List<Integer> minSubsequence(int[] nums) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		int totalSum = 0;

		for (int num : nums) {
			queue.add(num);
			totalSum += num;
		}

		List<Integer> list = new ArrayList<Integer>();
		int subSum = 0;

		while (subSum <= (totalSum - subSum)) {
			subSum += queue.peek();
			list.add(queue.poll());
		}

		return list;
	}

}
