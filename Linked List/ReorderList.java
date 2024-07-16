/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Push the second half of the list onto a stack
        Stack<ListNode> stack = new Stack<>();
        ListNode current = slow.next;
        slow.next = null;  // Cut the list into two halves
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Step 3: Merge the two halves
        ListNode first = head;
        while (!stack.isEmpty()) {
            ListNode temp = first.next;
            ListNode node = stack.pop();
            first.next = node;
            node.next = temp;
            first = temp;
        }
    }
}