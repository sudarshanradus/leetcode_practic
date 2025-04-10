//https://leetcode.com/problems/longest-common-prefix/description/
class Solution {
    public String longestCommonPrefix(String[] s) {
        if(1==s.length) {
			return s[0];
		}
        int count=0;
        int min=999;
		String same="";
		for(int i=0;i<s.length-1;i++) {			
			String temp="";
            String temp1=s[i];
			if(i<s.length-1) {
				temp=s[i+1];
			}
			for(int j=0;j<temp.length();j++) {
				if(j!=temp1.length()&&temp1.charAt(j)==temp.charAt(j)) {				
					count++;
			}else {
				break;
			}
			}
			if(count==0) {
				
				return "";
			}
            if(min>count) {
				min=count;
			}
			same=s[i].substring(0, min);
			count=0;
		}
		return same;
    }
}
