class Solution {
    public int primeDigits(int n) {
        int len = 1;
        int count = 4;
        int total = 0;

        // Find the length of the required number
        while (total + count < n) {
            total += count;
            len++;
            count *= 4;
        }

        // Index within numbers of this length (0-based)
        int index = n - total - 1;

        char[] map = {'2', '3', '5', '7'};
        StringBuilder ans = new StringBuilder();

        // Convert index to base-4 with fixed length
        for (int i = 0; i < len; i++) {
            ans.append(map[index / (count / 4)]);
            index %= (count / 4);
            count /= 4;
        }

        return Integer.parseInt(ans.toString());
    }
}