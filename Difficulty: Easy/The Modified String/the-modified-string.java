class Solution {
    public int modified(String s) {
        int ans = 0;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans += (count - 1) / 2;
                count = 1;
            }
        }

        // Last group
        ans += (count - 1) / 2;

        return ans;
    }
}