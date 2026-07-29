class Solution {
    public static boolean isLucky(int n) {
        // code here
        int counter = 2;
        
        int pos = n;
        
        while(true){
            if(pos < counter){
                return true;
            }
            if(pos %counter == 0){
                return false;
            }
            pos = pos - (pos/counter);
            counter++;
        }
    }
}