class Solution {
    public int longestSubarray(int[] arr) {
        int maxLen = 0;
        int curr = 0;

        for (int num : arr) {
            if (num >= 0) {
                curr++;
                maxLen = Math.max(maxLen, curr);
            } else {
                curr = 0;
            }
        }

        return maxLen;
    }
}