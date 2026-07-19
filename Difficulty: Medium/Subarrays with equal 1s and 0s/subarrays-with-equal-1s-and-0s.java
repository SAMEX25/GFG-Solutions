class Solution {
    public int countSubarray(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==0)
              sum+=-1;
              else
              sum+=1;
              
              if(map.containsKey(sum)){
                  count +=map.get(sum);
              }
              map.put(sum, map.getOrDefault(sum,0) +1);
        }
        return count;
    }
}