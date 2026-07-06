class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                result.add(arr[i]);
            }else{
                result.add(arr[i+1]);
            }
        }
        return result;
    }
};