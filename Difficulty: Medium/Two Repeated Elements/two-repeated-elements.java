class Solution {
    public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;
        int[] freq = new int[n + 1];
        int[] ans = new int[2];
        int index = 0;

        for (int num : arr) {
            freq[num]++;
            if (freq[num] == 2) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}