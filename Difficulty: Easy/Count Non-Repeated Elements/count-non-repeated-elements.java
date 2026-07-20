class Solution {
    public int countNonRepeated(int arr[]) {
        //  code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        int non = 0;
        for(int count : map.values()){
            if(count == 1){
                non++;
            }
        }
        return non;
    }
}