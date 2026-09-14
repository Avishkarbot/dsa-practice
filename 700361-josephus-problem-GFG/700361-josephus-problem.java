class Solution {
    // One based index
    public int josephus(int n, int k) {
       return solve(n,k) + 1;
    }
    
    public static int solve(int n, int k){
         if(n==1) return 0;
        return (solve(n-1,k) + k) % n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna