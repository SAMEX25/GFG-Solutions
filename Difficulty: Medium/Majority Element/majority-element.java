class Solution {
    int majorityElement(int arr[]) {
        // code here
        int element = arr[0];
        int count = 1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                element = arr[i];
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                count++;
            }
        }
        if(count > arr.length/2){
            return element;
        }
        return -1;
    }
}