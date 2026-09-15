class Solution {
    public int powMod(int x, int n, int M) {
            return (int) fastPow(x, n, M);
        }

        public long fastPow(long x, long n, int M) {
            if (n == 0) {
                return 1;
            }

            long half = fastPow(x, n / 2, M);

            long result = (half * half) % M;

            if ((n & 1) == 1) {
                result = (result * (x % M)) % M;
            }

            return result;
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna