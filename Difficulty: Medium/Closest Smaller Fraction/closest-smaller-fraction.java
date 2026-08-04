class Solution {
    public int[] largestFraction(int n, int d) {
        int bestNum = 0, bestDen = 1;

        for (int den = 1; den <= 10000; den++) {
            int num = (int)(((long)n * den - 1) / d);

            if (num < 0 || num > den) continue;

            if (gcd(num, den) != 1) continue;

            if ((long)num * bestDen > (long)bestNum * den) {
                bestNum = num;
                bestDen = den;
            }
        }

        return new int[]{bestNum, bestDen};
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}