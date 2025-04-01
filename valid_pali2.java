//https://leetcode.com/problems/valid-palindrome-ii/description/
class Solution {
    public boolean validPalindrome(String s) {
        if(ispali(s)) {
            return true;
		}
		int first=0;
		int last=s.length()-1;
		String b=s;
		while(first<last) {
			if(b.charAt(first)!=b.charAt(last)) {				
					b=righttrim(b,last);
					if(ispali(b)) {
						return true;
					}
				break;
			}
			first++;last--;
		}
		
		first=0;
		last=s.length()-1;
		while(first<=last) {
			if(s.charAt(first)!=s.charAt(last)) {
				s=lefttrim(s,first);
				if(ispali(s)) {
					return true;
				}
			break;
			}
			first++;last--;
		}
    return false;
	}
	public static String lefttrim(String s,int left) {
//		s=s.replace(String.valueOf(s.charAt(left)), "");
		s = s.substring(0, left) + s.substring(left+ 1);
		return s;
	}
	public static String righttrim(String s,int right) {
		s=s.substring(0,right)+s.substring(right+1);
		return s;
	}
	public static boolean ispali(String s) {
		int start=0;
		int end=s.length()-1;
		boolean yes=true;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				yes=false;
				break;
			}
			start++;end--;
		}
		return yes;
	}   
}
