import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int maxSoFar = Integer.MIN_VALUE;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                ans.add(arr[i]);
                maxSoFar = arr[i];
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
}