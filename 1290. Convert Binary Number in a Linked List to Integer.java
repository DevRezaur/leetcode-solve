class Solution {

	public int getDecimalValue(ListNode head) {
		ListNode current = head;
		List<Integer> list = new ArrayList<Integer>();

		while (current != null) {
			list.add(current.val);
			current = current.next;
		}

		int ans = 0, j = 0;

		for (int i = list.size() - 1; i >= 0; i--) {
			int n = list.get(i);
			ans += n * Math.pow(2, j++);
		}

		return ans;
	}

}
