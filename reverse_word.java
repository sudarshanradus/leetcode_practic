//https://leetcode.com/problems/reverse-words-in-a-string/description/
class Solution {
    public String reverseWords(String s) {
    s=s.trim();
	String[] s1=s.split(" ");
	String trim="";
	for(int i=s1.length-1;i>=0;i--) {
		if(s1[i]!="") {
			trim+=s1[i];
            if(i!=0){
			trim+=" ";
            }
		}
		
	}
	return trim;
    }
}
