//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
	boolean check=false;
	for(int i=0;i<patterns.length;i++) {
		String temp=patterns[i];
		check=word.contains(temp);
		if(check) {
			count++;
			check=false;
		}
		}
	return count;
    }
}
