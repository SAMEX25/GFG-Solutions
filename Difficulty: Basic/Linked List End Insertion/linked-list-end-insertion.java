class Solution {
    public Node insertAtEnd(Node head, int x) {

        Node newNode = new Node(x);

        // If linked list is empty
        if (head == null) {
            return newNode;
        }

        // Go to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert at end
        temp.next = newNode;

        return head;
    }
}