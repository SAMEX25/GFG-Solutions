/*
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
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return countLength(slow);
            }
        }
        return 0;
    }
    
    private int countLength(Node curr){
        int length = 1;
        Node temp = curr;
        
        while(temp.next !=curr){
            length++;
            temp = temp.next;
        }
        return length;
    }
}