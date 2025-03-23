//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
        
    }
}
--------------------------------------------------------------------------------------
class Solution {
    public int strStr(String haystack, String needle) {
	if(needle.length()>haystack.length()) {
		return -1;
	}
	int count=-1;
	int k=0;
	for(int i=0;i<haystack.length();i++) {
		if(haystack.charAt(i)==needle.charAt(0)) {
			k=i;
			for(int j=0;j<needle.length();j++) {
				if(k<haystack.length()&&haystack.charAt(k)==needle.charAt(j)) {					
					if(j==0) {
						count=k;
					}
					k++;
				}
				else {
					j=0;
					count=-1;
					break;
				}
			}
			if(j==needle.length()) {
				return count;
			
			}
		}
	}
	return -1;
    }
}
