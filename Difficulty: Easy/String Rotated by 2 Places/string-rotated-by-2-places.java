class Solution {
    public static boolean isRotated(String s1, String s2) {
        int n = s1.length();

        if (n != s2.length()) {
            return false;
        }

        // For strings of length 1, rotation by 2 gives the same string
        if (n <= 2) {
            return s1.equals(s2);
        }

        // Anti-clockwise rotation by 2
        String antiClockwise = s1.substring(2) + s1.substring(0, 2);

        // Clockwise rotation by 2
        String clockwise = s1.substring(n - 2) + s1.substring(0, n - 2);

        return s2.equals(antiClockwise) || s2.equals(clockwise);
    }
}