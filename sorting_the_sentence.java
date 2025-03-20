// https://leetcode.com/problems/sorting-the-sentence/
class Solution {
    public String sortSentence(String s) {
     String[] a = s.split(" ");
	 String[] str = new String[a.length+1];
	 for(int i=0;i<a.length;i++){
	     String temp=a[i];
	     int pos = Character.getNumericValue(temp.charAt(temp.length()-1));
	     String let=temp.substring(0,temp.length()-1);
	     str[pos]=let;
	 }
	 String k="";
	 for(int j=1;j<str.length;j++) {
        k+=str[j]+" ";
	 }
    return k.trim();
    }
}
