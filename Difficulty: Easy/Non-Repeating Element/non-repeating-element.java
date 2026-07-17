class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr)
            map.merge(x,1,Integer::sum);
            for(int x:arr)
                if(map.get(x)==1)return x;
        
        return 0;
    }
}