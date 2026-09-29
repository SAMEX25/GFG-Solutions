class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Subarray from index 0 to i has sum 0
            if (sum == 0) {
                maxLen = i + 1;
            }

            // Same prefix sum means the middle part sums to 0
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // Store only the first occurrence
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}