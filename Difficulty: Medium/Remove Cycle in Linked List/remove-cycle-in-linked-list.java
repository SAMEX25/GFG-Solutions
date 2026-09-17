class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        // No loop
        if (slow != fast)
            return;

        // Step 2: Find start of loop
        slow = head;

        // Special case: loop starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // Move both until they meet at loop start
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove loop
        fast.next = null;
    }
}