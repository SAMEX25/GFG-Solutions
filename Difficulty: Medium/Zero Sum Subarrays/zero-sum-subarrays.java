class Solution {
    public int findSubarray(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        int prefixSum = 0;
        
        map.put(0,1);
        
        for(int num:arr){
            prefixSum +=num;
        
            if(map.containsKey(prefixSum)){
                count +=map.get(prefixSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
