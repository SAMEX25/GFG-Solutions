class Solution {
    public ArrayList<Integer> maxSubMatSum(int[][] mat, int[][] queries) {
        int n = mat.length;
        int m = mat[0].length;

        // Build 2D prefix sum
        long[][] pref = new long[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pref[i][j] = mat[i - 1][j - 1]
                        + pref[i - 1][j]
                        + pref[i][j - 1]
                        - pref[i - 1][j - 1];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];

            long maxSum = Long.MIN_VALUE;

            // Top-left corner of the a x b submatrix
            for (int i = 0; i + a <= n; i++) {
                for (int j = 0; j + b <= m; j++) {

                    int r1 = i;
                    int c1 = j;
                    int r2 = i + a;
                    int c2 = j + b;

                    long sum = pref[r2][c2]
                            - pref[r1][c2]
                            - pref[r2][c1]
                            + pref[r1][c1];

                    maxSum = Math.max(maxSum, sum);
                }
            }

            ans.add((int) maxSum);
        }

        return ans;
    }
}