import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

	public int lastStoneWeight(int[] stones) {
		Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int stone : stones) {
			queue.add(stone);
		}

		while (queue.size() > 1) {
			int remainingWeight = queue.poll() - queue.poll();

			if (remainingWeight > 0)
				queue.add(remainingWeight);
		}

		return queue.isEmpty() ? 0 : queue.poll();
	}
  
}
