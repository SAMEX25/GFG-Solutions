class Solution {
    public int[] dupLastIndex(int[] arr) {
        int index = -1;
        int value = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                index = i;
                value = arr[i];
            }
        }

        return new int[]{index, value};
    }
}
