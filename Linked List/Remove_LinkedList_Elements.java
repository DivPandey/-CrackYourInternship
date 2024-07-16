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
public class Remove_LinkedList_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode Next = dummy;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val == val){
                curr = curr.next;
            }else{
                Next.next = curr;
                curr = curr.next;
                Next = Next.next;
                Next.next = null;
            }
        }
        return dummy.next;
    }
}