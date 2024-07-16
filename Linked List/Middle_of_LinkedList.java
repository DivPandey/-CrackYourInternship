
/**
 * Middle_of_LinkedList
 */
public class Middle_of_LinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode s1 = head;
        ListNode s2 = head;
        while (s2 != null && s2.next != null) {
            s1 = s1.next;
            s2 = s2.next.next;
        }
        return s1;
    }
}

class ListNode {

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
