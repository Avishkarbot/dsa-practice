class Solution {
    boolean isPalindrome(String s) {
        return solve(s,0,s.length()-1);
       
    }
    
    public static boolean solve(String s, int l, int r){
         if(r==l || l>r){
            return true;
        }
        
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return solve(s,l+1,r-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna