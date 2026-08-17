class Solution {
    static int isSumPalindrome(int n) {
        for (int i = 0; i <= 5; i++) {
            if (isPalindrome(n)) {
                return n;
            }

            if (i == 5) {
                break;
            }

            n = n + reverse(n);
        }

        return -1;
    }

    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}