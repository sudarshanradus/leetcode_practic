//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
class Solution {
    public boolean checkIfPangram(String str) {
        char ch = 'a';
		for(int i=0;i<26;i++) {
			if(!str.contains(ch+++"")) {
				return false;
			}
		}
		return true;
    }
}
