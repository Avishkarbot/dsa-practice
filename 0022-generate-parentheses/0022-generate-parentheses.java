class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n,0,0,"",list);
        return list;
    }

    public static void solve(int n, int o, int c, String str,List<String> list) {
		if(o==n && c==n) {
			list.add(str);
			return;
		}

		if(o<n) {
			solve(n,o+1,c,str+'(',list);
		}
		if(c<o) {
			solve(n,o,c+1,str+')',list);
		}

	}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna