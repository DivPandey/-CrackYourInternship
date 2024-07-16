/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
public class DeleteNodesHavingGreaterElementRight
{
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node Next = curr;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    Node compute(Node head)
    {
        // your code here
       Node init = reverse(head);
       Node dummy = new Node(-1);
       Node temp = dummy;
       Node curr = init;
       while(curr!=null){
           if(curr.data>=temp.data){
               temp.next = curr;
               temp = curr;
               curr = curr.next;
               temp.next = null;
           }else{
               curr = curr.next;
           }
       }
       return reverse(dummy.next);
    }
}