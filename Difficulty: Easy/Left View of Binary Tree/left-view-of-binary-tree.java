/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
public ArrayList<Integer> leftView(Node root) {
ArrayList<Integer> result = new ArrayList<>();

    if (root == null) {
        return result;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Node current = queue.poll();

            // First node at each level
            if (i == 0) {
                result.add(current.data);
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    return result;
}

}
