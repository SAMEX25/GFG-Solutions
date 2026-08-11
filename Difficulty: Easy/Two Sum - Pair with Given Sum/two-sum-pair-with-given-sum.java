class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int num: arr){
            int sum = target - num;
            if(set.contains(sum)){
                return true;
            
        }
        set.add(num);
    }
    return false;
}
}