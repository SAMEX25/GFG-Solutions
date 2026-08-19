class Solution {
    public ArrayList<Integer> filterByDigits(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            int n = num;
            boolean valid = true;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 1 && digit != 2 && digit != 3) {
                    valid = false;
                    break;
                }

                n /= 10;
            }

            if (valid) {
                ans.add(num);
            }
        }

        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}