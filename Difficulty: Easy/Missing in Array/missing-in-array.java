class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor = 0;
        for(int i=1; i<=arr.length+1; i++){
            xor ^= i;
        }
        for(int num:arr){
            xor ^= num;
        }
        return xor;
    }
}