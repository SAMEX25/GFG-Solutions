import java.util.*;

class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of elements in a1
        for (int num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Place elements according to a2
        for (int num : a2) {
            if (map.containsKey(num)) {
                int freq = map.get(num);
                while (freq-- > 0) {
                    a1[index++] = num;
                }
                map.remove(num);
            }
        }

        // Store remaining elements
        ArrayList<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            while (freq-- > 0) {
                remaining.add(num);
            }
        }

        Collections.sort(remaining);

        // Append remaining sorted elements
        for (int num : remaining) {
            a1[index++] = num;
        }
    }
}