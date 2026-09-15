class Solution {
    public List<String> powerSet(String s) {
        List<String> list = new ArrayList<>();
        listSubSet(s,0,"",list);
        Collections.sort(list);
        return list;
    }
    
    public static void listSubSet(String s, int i, String cur, List<String> list){
        if(i>=s.length()){
            list.add(cur);
            return;
        }
        
        listSubSet(s, i+1, cur+s.charAt(i),list);
        listSubSet(s, i+1, cur,list);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna