class Solution {
    public double myPow(double x, int n) {
        long num = n;
        boolean flag = false;
        if (num < 0) {
            num = - num;
            flag = true;
        }
        return flag ? 1 / fastPow(x, num) : fastPow(x, num);
        // return flag ? 1 / pow(x, num) : pow(x, num);
    }
    public static double fastPow(double x, long n) {
        if (n <= 0) {
            return 1;
        }
        return ((n & 1) == 0) ? fastPow(x*x, n/2) : x * fastPow(x, n - 1);

    }

    public static double pow(double x, long n){
        if(n<=0){
            return 1;
        }
        return x * pow(x,n-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna