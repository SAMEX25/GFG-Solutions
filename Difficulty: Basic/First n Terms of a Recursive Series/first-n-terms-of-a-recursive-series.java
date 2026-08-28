class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n >= 1) ans.add(0);
        if (n >= 2) ans.add(1);

        for (int i = 2; i < n; i++) {
            int next = ans.get(i - 2) * ans.get(i - 2) - ans.get(i - 1);
            ans.add(next);
        }

        return ans;
    }
}