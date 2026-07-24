/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        Node firstNode = head;
        Node secondNode = head.next;
        
        firstNode.next = pairwiseSwap(secondNode.next);
        secondNode.next = firstNode;
        
        return secondNode;
    }
}