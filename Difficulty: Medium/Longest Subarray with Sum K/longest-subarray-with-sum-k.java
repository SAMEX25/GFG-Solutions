import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Subarray from index 0 to i
            if (sum == k) {
                maxLen = i + 1;
            }

            // Check if a previous prefix sum exists
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store the first occurrence of each prefix sum
            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }
}

