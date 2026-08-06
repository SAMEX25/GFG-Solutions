class Solution {
    static int repeatedCharacter(String S) {
        int[] first = new int[256];

        for (int i = 0; i < 256; i++) {
            first[i] = -1;
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (first[ch] == -1) {
                first[ch] = i;
            } else {
                ans = Math.min(ans, first[ch]);
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}