class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies in a[]
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Check whether b[] can be formed from a[]
        for (int x : b) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return false;
            }

            map.put(x, map.get(x) - 1);
        }

        return true;
    }
}
