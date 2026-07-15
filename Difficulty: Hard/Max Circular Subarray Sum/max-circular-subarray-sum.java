class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int total = 0;
        int max = arr[0], currMax = 0;
        int min=arr[0], currMin = 0;
        
        for(int num:arr){
            total += num;
            
            currMax = Math.max(num, currMax + num);
            max = Math.max(max, currMax);
            
            currMin = Math.min(num, currMin + num);
            min = Math.min(min, currMin);
        }   
        return max < 0 ? max : Math.max(max, total - min);
    }
}
