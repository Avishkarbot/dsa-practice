class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        return fibNum(n);
    }

    public static int fibNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibNum(n - 1) + fibNum(n - 2);
    }
}