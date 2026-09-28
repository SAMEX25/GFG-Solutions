class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {

            // Remove elements that are not greater
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Top is the nearest greater element
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(stack.peek());
            }

            // Current element can be a candidate for elements on its left
            stack.push(arr[i]);
        }

        // We processed from right to left, so reverse the answer
        Collections.reverse(ans);

        return ans;
    }
}