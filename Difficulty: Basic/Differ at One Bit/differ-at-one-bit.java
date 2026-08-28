class Solution {
    public boolean differOneBit(int a, int b) {
        int x = a ^ b;
        return x != 0 && (x & (x - 1)) == 0;
    }
}