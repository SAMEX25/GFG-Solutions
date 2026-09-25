import java.util.*;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        if (n <= 1) return 0;

        Arrays.sort(arr);

        // Initial difference without making any changes
        int ans = arr[n - 1] - arr[0];

        // Try every possible split:
        // [0...i]  -> increase by k
        // [i+1...n-1] -> decrease by k
        for (int i = 0; i < n - 1; i++) {

            // Cannot decrease this tower below zero
            if (arr[i + 1] - k < 0)
                continue;

            int minHeight = Math.min(arr[0] + k, arr[i + 1] - k);
            int maxHeight = Math.max(arr[i] + k, arr[n - 1] - k);

            ans = Math.min(ans, maxHeight - minHeight);
        }

        return ans;
    }
}