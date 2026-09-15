class Solution {
    public static int  countOccurrence(String str, String subStr) {
		return countOccurrence(str, subStr, 0);
	}

	public static int  countOccurrence(String str, String subStr, int i) {
		if(i>str.length() - subStr.length()) {
			return 0;
		}

		int count = countOccurrence(str, subStr, i+1);
		if(str.substring(i,i+subStr.length()).equals(subStr)) {
			count+=1;
		}
		return count;
	}
}
