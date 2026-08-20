class Solution {
    public void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();

        sortStack(st);

        insert(st, top);
    }

    private void insert(Stack<Integer> st, int x) {
        // Largest element should be on top
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int top = st.pop();

        insert(st, x);

        st.push(top);
    }
}