class Solution {
    public int maxOccured(List<Integer> L, List<Integer> R) {
        int maxR = 0;

        // Find the maximum value in R
        for (int x : R) {
            maxR = Math.max(maxR, x);
        }

        int[] diff = new int[maxR + 2];

        // Build difference array
        for (int i = 0; i < L.size(); i++) {
            diff[L.get(i)]++;
            diff[R.get(i) + 1]--;
        }

        int maxCount = 0;
        int ans = 0;
        int curr = 0;

        // Prefix sum to find maximum occurrence
        for (int i = 0; i <= maxR; i++) {
            curr += diff[i];
            if (curr > maxCount) {
                maxCount = curr;
                ans = i;
            }
        }

        return ans;
    }
}
