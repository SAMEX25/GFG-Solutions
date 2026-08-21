class Solution {
    public List<Integer> threeDivisors(List<Integer> query) {

        int max = Collections.max(query);
        int limit = (int) Math.sqrt(max);

        // Sieve
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        if (limit >= 0) prime[0] = false;
        if (limit >= 1) prime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Prefix count of primes
        int[] count = new int[limit + 1];

        for (int i = 1; i <= limit; i++) {
            count[i] = count[i - 1];

            if (prime[i]) {
                count[i]++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int n : query) {
            int sqrt = (int) Math.sqrt(n);
            ans.add(count[sqrt]);
        }

        return ans;
    }
}