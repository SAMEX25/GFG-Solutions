import java.util.*;

class Solution {
    public static int closestToZero(int arr[]) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int ans = 0;
        int min = Integer.MAX_VALUE;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                ans = sum;
            } 
            else if (Math.abs(sum) == min && sum > ans) {
                ans = sum;
            }

            if (sum < 0)
                left++;
            else
                right--;
        }

        return ans;
    }
}