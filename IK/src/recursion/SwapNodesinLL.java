package recursion;

public class SwapNodesinLL {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {

	}

	public ListNode swapPairs(ListNode head) {
		if (head != null && head.next != null) {

			int temp = head.val;
			head.val = head.next.val;
			head.next.val = temp;
			if (head.next.next != null) {

				swapPairs(head.next);
			}

		}
		return head;
	}

}
