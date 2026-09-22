class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        String keys[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        StringBuilder sb = new StringBuilder();
        keyPad(digits, 0, sb, keys, list);
        return list;
    }

    public static void keyPad(String digits, int index, StringBuilder current, String keys[], List<String> list) {
        if (index > digits.length()-1) {
            list.add(current.toString());
            return;
        }

        int d = digits.charAt(index) - '0';
        String key = keys[d];

        for (int i = 0; i < key.length(); i++) {
            current.append(key.charAt(i));
            keyPad(digits, index + 1, current, keys, list);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna