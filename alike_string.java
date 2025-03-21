//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
class Solution {
    public boolean halvesAreAlike(String s) {
    if(s.length()%2!=0){
        return false;
    }
    s=s.toLowerCase();
	String a = s.substring(0,s.length()/2);
	String b = s.substring(s.length()/2,s.length());
	int count1=0;
    int count2=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)=='a'|| a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o'|| a.charAt(i)=='u') {
			count1++;
		}
    }
    for(int j=0;j<b.length();j++) {
		if(b.charAt(j)=='a'|| b.charAt(j)=='e'|| b.charAt(j)=='i'|| b.charAt(j)=='o'|| b.charAt(j)=='u') {
			count2++;
		}
    }
    if(count1==count2){
        return true;
    }
    return false;

}
}
