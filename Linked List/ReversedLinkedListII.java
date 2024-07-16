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
public class ReversedLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right) return head;
        ListNode dummy = new ListNode(-1,head);
        ListNode leftNode = dummy;
        for(int i = 0; i<left-1; i++){
            leftNode = leftNode.next;
        }
        ListNode newRight = leftNode.next;
        ListNode curr = newRight;
        ListNode prev = null;
        ListNode nextNode;
        while(left++ <=right){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        leftNode.next = prev;
        newRight.next = curr;
        return dummy.next;
    }
}