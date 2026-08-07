class Solution {
    public static String concatenatedString(String s1, String s2) {
        boolean[] inS1 = new boolean[256];
        boolean[] inS2 = new boolean[256];

        for (char ch : s1.toCharArray()) {
            inS1[ch] = true;
        }

        for (char ch : s2.toCharArray()) {
            inS2[ch] = true;
        }

        StringBuilder ans = new StringBuilder();

        // Add characters from s1 not present in s2
        for (char ch : s1.toCharArray()) {
            if (!inS2[ch]) {
                ans.append(ch);
            }
        }

        // Add characters from s2 not present in s1
        for (char ch : s2.toCharArray()) {
            if (!inS1[ch]) {
                ans.append(ch);
            }
        }

        return ans.length() == 0 ? "-1" : ans.toString();
    }
}