class Solution {
    public ArrayList<Integer> linearProbing(int[] arr, int m) {
        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize hash table with -1
        for (int i = 0; i < m; i++) {
            ans.add(-1);
        }

        for (int value : arr) {
            int index = value % m;
            int start = index;

            while (ans.get(index) != -1) {
                // Duplicate: already present at this position
                if (ans.get(index) == value) {
                    break;
                }

                // Move to next position
                index = (index + 1) % m;

                // Table is full / no empty position found
                if (index == start) {
                    break;
                }
            }

            // Insert only if the current slot is empty
            if (ans.get(index) == -1) {
                ans.set(index, value);
            }
        }

        return ans;
    }
}