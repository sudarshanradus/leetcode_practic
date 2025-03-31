//https://leetcode.com/problems/valid-palindrome/description/
class Solution {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();
		s = s.replaceAll("[^a-z0-9]", "");
	        String temp="";
	        System.out.println(s);
	        for(int i=s.length()-1;i>=0;i--){	            	
	            	temp+=s.charAt(i)+"";
	        }
    return s.equals(temp);
    }
}
