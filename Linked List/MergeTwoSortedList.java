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
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev  = dummy;
        while(list1!=null && list2!=null){
            prev.next = (list1.val<=list2.val) ? list1 : list2;
            if(list1.val<=list2.val){
                list1 = list1.next;
            }else{
                list2 = list2.next;
            }
            prev = prev.next;
            prev.next = null;
        }
        prev.next = (list1==null) ? list2 : list1;
        return dummy.next;
    }
}