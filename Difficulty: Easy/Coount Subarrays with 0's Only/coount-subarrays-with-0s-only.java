class Solution {
    public int noOfSubarrays(int[] arr) {
        long count = 0;
        long ans = 0;

        for (int x : arr) {
            if (x == 0) {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }

        return (int) ans;
    }
}