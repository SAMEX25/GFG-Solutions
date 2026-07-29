class Solution {
    public int josephus(int n, int k) {
        // code here
        int x = 0;
        
        for(int i=2; i<=n; i++){
            x = (x+k) % i;
        }
        return x + 1;
    }
}