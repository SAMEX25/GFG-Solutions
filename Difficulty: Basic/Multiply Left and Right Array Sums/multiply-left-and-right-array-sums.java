class Solution {
    public int multiply(int[] arr) {
        int n = arr.length;

        int leftSum = 0;
        int rightSum = 0;

        // First half
        for (int i = 0; i < n / 2; i++) {
            leftSum += arr[i];
        }

        // Remaining elements
        for (int i = n / 2; i < n; i++) {
            rightSum += arr[i];
        }

        return leftSum * rightSum;
    }
}