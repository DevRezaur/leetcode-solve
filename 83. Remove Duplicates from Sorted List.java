class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;

		ListNode current = head;
		ListNode deleteNode = head;

		while (current != null) {
			while (deleteNode.next != null && current.val == deleteNode.next.val) {
				deleteNode = deleteNode.next;
			}
			current.next = deleteNode.next;
			current = current.next;
		}

		return head;
	}

}
