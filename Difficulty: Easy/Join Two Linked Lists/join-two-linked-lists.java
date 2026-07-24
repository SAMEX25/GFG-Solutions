/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node joinLists(Node head1, Node head2) {
        // code here
        if(head1 == null){
            return head2;
        }
        if(head2 ==null){
            return head1;
        }
        Node current = head1;
        while(current.next !=null){
            current = current.next;
        }
        current.next = head2;
        
        return head1;
    }
}
