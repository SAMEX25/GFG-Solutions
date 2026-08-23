class Solution {
    public int nthTerm(int a, int r, int n) {
        long MOD = 1000000007L;

        long result = 1;
        long base = r;
        long power = n - 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            power >>= 1;
        }

        return (int)((a * result) % MOD);
    }
}