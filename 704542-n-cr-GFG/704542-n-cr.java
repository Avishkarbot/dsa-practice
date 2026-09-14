class Solution {
    public int nCr(int n, int r) {
        
        
        int[][] dp = new int[n+1][r+1];
        
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return solve(n,r,dp);
       
    }
    
    public static int solve(int n, int r, int[][] dp){
        if(r>n) return 0;
        
        if(r<=0 || r==n){
            return 1;
        }
        
        if(dp[n][r]!=-1){
            return dp[n][r];
        }
        dp[n][r] =  solve(n-1,r-1,dp) + solve(n-1,r,dp);
        return dp[n][r];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna