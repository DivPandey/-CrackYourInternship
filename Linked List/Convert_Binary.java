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
class Convert_Binary {
    public static int length(ListNode head){
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public int getDecimalValue(ListNode head) {
        int power = length(head)-1;
        int ans = 0;
        ListNode curr = head;
        while(curr!=null){
            ans = ans+(curr.val*(1<<(power)));
            curr = curr.next;
            power--;
        }
        return ans;
    }
}