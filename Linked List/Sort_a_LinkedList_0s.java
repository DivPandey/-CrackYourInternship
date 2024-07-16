
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        ArrayList<Integer> nodes = new ArrayList<>();
        Node curr = head;
        while(curr!=null){
            nodes.add(curr.data);
            curr = curr.next;
        }
        Collections.sort(nodes);
        Node ans = new Node(-1);
        curr = ans;
        for(int i = 0; i < nodes.size(); i++){
            curr.next = new Node(nodes.get(i));
            curr = curr.next;
        }
        return ans.next;
    }
}
