/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Node temp = head;
        // inserting the copy of nodes after every node
        while(temp!=null){
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }
        // connecting the random pointers
        temp = head;
        while(temp!=null){
            temp.next.random = (temp.random == null) ? null : temp.random.next;
            temp = temp.next.next;
        }
        Node dummy = new Node(-1);
        Node prev = dummy;
        temp = head;
        // Extracting the nodes
        while(temp!=null){
            prev.next = temp.next;
            prev = prev.next;
            temp.next = prev.next;
            temp = prev.next;
        }
        return dummy.next;
    }
}