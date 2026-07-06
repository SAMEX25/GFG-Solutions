class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max = arr[0];
        int currentSum = arr[0];
        
        for(int i=1; i<arr.length; i++){
            currentSum = Math.max(arr[i] , currentSum+arr[i]);
            max = Math.max(max,currentSum);
        }
        return max;
    }
}
