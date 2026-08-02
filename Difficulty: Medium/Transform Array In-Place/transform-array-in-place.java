class Solution {
    public void arrange(int[] arr) {
        int n = arr.length;

        // Encode both old and new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }

        // Extract the new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}