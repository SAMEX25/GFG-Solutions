import java.util.*;

class Solution {
    public int thirdLargest(List<Integer> arr) {

        if (arr.size() < 3) {
            return -1;
        }

        Collections.sort(arr);

        return arr.get(arr.size() - 3);
    }
}