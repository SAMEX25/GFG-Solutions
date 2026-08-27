class Solution {
    public int sequence(int n) {
        final long MOD = 1000000007L;

        long ans = 0;
        long start = 1;

        for (int i = 1; i <= n; i++) {
            long term = 1;

            for (int j = 0; j < i; j++) {
                term = (term * (start + j)) % MOD;
            }

            ans = (ans + term) % MOD;
            start += i;
        }

        return (int) ans;
    }
};