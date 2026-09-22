class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        int n = arr.length;
        int[] freq = new int[n + 1];

        // Count frequency of each number
        for (int x : arr) {
            freq[x]++;
        }

        int repeating = -1;
        int missing = -1;

        // Find repeating and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2)
                repeating = i;
            else if (freq[i] == 0)
                missing = i;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);

        return ans;
    }
}