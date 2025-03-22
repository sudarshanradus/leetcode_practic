//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
class Solution {
    public String reverseWords(String s) {
       String temp="";
//		System.out.println(Arrays.toString(a));
		
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i);
		}
		String[] a= temp.split(" ");
		s="";
		for(int i=a.length-1;i>=0;i--) {
			s+=a[i];
			if(i!=0) {				
				s+=" ";
			}
            else{
                return s;
            }
		}
		return s;
    }
}
