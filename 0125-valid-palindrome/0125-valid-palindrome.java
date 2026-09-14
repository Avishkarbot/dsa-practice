class Solution {
    public boolean isPalindrome(String s) {
        String str = removeNonAlphanumeric(s);
        return solve(str,0,str.length()-1);
    }

    public static String removeNonAlphanumeric(String str){
        str = str.replaceAll(
          "[^a-zA-Z0-9]", "");
        return str.toLowerCase();
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