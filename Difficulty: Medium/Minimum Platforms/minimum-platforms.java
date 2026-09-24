class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int platforms = 0;
        int maxPlatforms = 0;

        while (i < n && j < n) {
            // Arrival happens before/equal to departure:
            // need another platform
            if (arr[i] <= dep[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                // A train has departed, so its platform is free
                platforms--;
                j++;
            }
        }

        return maxPlatforms;
    }
}