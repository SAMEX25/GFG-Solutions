class Solution {
    public boolean isPossible(String s) {
        int n = s.length();

        if (n < 4) return false;

        // We can always split into lengths 1, 2, 3, and n-6.
        // For n >= 10, all lengths are distinct.
        if (n >= 10) return true;

        // n is at most 9, so brute force is effectively O(1)
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);

                    if (!a.equals(b) &&
                        !a.equals(c) &&
                        !a.equals(d) &&
                        !b.equals(c) &&
                        !b.equals(d) &&
                        !c.equals(d)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}