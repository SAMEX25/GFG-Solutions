import java.util.*;

class Solution {
    public int solve(int[] a, int[] b) {
        List<Integer> evenA = new ArrayList<>();
        List<Integer> oddA = new ArrayList<>();
        List<Integer> evenB = new ArrayList<>();
        List<Integer> oddB = new ArrayList<>();

        long sumA = 0, sumB = 0;

        for (int x : a) {
            sumA += x;
            if (x % 2 == 0)
                evenA.add(x);
            else
                oddA.add(x);
        }

        for (int x : b) {
            sumB += x;
            if (x % 2 == 0)
                evenB.add(x);
            else
                oddB.add(x);
        }

        // Total sum must remain unchanged.
        if (sumA != sumB)
            return -1;

        // Parity cannot change.
        if (evenA.size() != evenB.size() ||
            oddA.size() != oddB.size()) {
            return -1;
        }

        Collections.sort(evenA);
        Collections.sort(evenB);
        Collections.sort(oddA);
        Collections.sort(oddB);

        long positive = 0;

        for (int i = 0; i < evenA.size(); i++) {
            long diff = (long) evenA.get(i) - evenB.get(i);
            if (diff > 0)
                positive += diff;
        }

        for (int i = 0; i < oddA.size(); i++) {
            long diff = (long) oddA.get(i) - oddB.get(i);
            if (diff > 0)
                positive += diff;
        }

        return (int) (positive / 2);
    }
}