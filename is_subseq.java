//https://leetcode.com/problems/is-subsequence/description/?source=submission-noac
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
		while(j<t.length()&&i<s.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
        return i==s.length();
    }
}
