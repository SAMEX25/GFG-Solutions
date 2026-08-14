/*  Structure of a doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
} */

class Solution {
     public boolean isCircular(Node head) {
         if (head == null) return false;

         Node curr = head.next;

         while (curr != null && curr != head) {
             curr = curr.next;
         }

         return curr == head;
     }
 }