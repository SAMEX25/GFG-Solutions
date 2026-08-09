class Solution {
    public static boolean checkPangram(String s) {
        boolean[] present = new boolean[26];

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                present[ch - 'A'] = true;
            } else if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        // Check if all 26 letters are present
        for (boolean letter : present) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}