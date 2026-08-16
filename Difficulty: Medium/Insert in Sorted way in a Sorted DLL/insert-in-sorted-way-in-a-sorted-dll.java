/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);

        // Case 1: Empty list or insert before head
        if (head == null || x <= head.data) {
            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            return newNode;
        }

        // Find the first node whose data is >= x
        Node curr = head;

        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }

        // Insert newNode after curr
        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;

        return head;
    }
}