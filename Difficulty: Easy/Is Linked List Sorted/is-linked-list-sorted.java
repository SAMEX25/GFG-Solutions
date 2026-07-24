/* Structure of linked list Node
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};*/

class Solution {
    public boolean isSorted(Node head) {
        // code here
        if(head == null || head.next==null)
            return true;
        
        boolean high = true;
        boolean low = true;
        
        Node curr = head;
        
        while(curr.next != null){
         if(curr.data>curr.next.data)
             high = false;
          if(curr.data <curr.next.data)
          low = false;
          
          curr = curr.next;
        }
        return high || low;
    }
}