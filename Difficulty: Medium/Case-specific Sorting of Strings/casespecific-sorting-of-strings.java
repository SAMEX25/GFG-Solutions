import java.util.*;

class Solution {
    public static String caseSort(String s) {
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                upper.add(ch);
            else
                lower.add(ch);
        }

        Collections.sort(upper);
        Collections.sort(lower);

        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                ans.append(upper.get(i++));
            else
                ans.append(lower.get(j++));
        }

        return ans.toString();
    }
}