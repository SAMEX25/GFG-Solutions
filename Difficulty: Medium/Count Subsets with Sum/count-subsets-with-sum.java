class Solution {
    static int perfectSum(int[] arr, int target) {
        int[] dp = new int[target + 1];

        // Empty subset
        dp[0] = 1;

        for (int num : arr) {
            // Traverse backwards so each element is used only once
            for (int sum = target; sum >= num; sum--) {
                dp[sum] += dp[sum - num];
            }
        }

        return dp[target];
    }
}