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
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode Less = new ListNode(-1);
        ListNode ln = Less;
        ListNode More = new ListNode(0);
        ListNode mn = More;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                ln.next = curr;
                curr = curr.next;
                ln = ln.next;
                ln.next = null;
            }
            else{
                mn.next = curr;
                curr = curr.next;
                mn = mn.next;
                mn.next = null;
            }
        }
        ln.next = More.next;
        return Less.next;
    }
}