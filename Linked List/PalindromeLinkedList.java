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
public class PalindromeLinkedList {
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = curr;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public static ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = midNode(head);
        mid = reverse(mid);
        while(mid!=null){
            if(mid.val!=head.val) return false;
            mid = mid.next;
            head = head.next;
        }
        return true;
    }
}