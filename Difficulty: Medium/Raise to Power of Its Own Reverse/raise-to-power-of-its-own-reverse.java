class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int og = n;
        int reverse = 0;
        
        while(og>0){
            int digit = og%10;
            reverse = (reverse*10) + digit;
            og /=10;
        }
        long result = 1;
        for(int i=0; i<reverse; i++){
            result *=n;
        }
        return (int) result;
        
    }
}
