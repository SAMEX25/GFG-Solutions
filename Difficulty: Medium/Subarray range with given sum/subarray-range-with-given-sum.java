class Solution {
    static int subArraySum(int arr[], int tar) {
        //  code here
        HashMap<Integer , Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int curr = 0;
        int count =0;
        
        for(int num:arr){
            curr +=num;
            if(map.containsKey(curr-tar)){
                count +=map.get(curr - tar);
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return count;
    }
}