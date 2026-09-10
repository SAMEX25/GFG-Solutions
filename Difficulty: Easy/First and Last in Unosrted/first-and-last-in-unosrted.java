class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        int n = arr.length;
        int start = -1;

        // iterating over the array to find the start index of the key.
        for (int i = 0; i < n; i++) {

            // if current element is equal to the key, update start index
            // and break the loop.
            if (arr[i] == key) {
                start = i;
                break;
            }
        }

        int end = start;
        for (int i = n - 1; i >= 0; i--) {

            // if current element is equal to the key, update end index
            // and break the loop.
            if (arr[i] == key) {
                end = i;
                break;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(end);
        return ans;
    }
};