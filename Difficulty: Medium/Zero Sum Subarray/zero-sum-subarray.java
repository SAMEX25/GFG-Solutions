class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for(int num:arr){
            prefixSum += num;
            
            if(prefixSum ==0 || num ==0 || set.contains(prefixSum)){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}