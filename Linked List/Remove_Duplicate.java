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
public class Remove_Duplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        ListNode Next = dummy;
        while(curr!=null){
            if(curr.next!=null && curr.val == curr.next.val){
                while(curr.next!=null && curr.val == curr.next.val){
                    curr = curr.next;
                }
            }
            Next.next = curr;
            Next = curr;
            curr = curr.next;
            Next.next = null;
        }
        return dummy.next;
    }
}