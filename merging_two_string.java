//https://leetcode.com/problems/merge-strings-alternately/description/
class Solution {
    public String mergeAlternately(String word1, String word2) {
       String temp="";
       int i=0;int j=0;
        while(i<word1.length()||j<word2.length()){
            if(i<word1.length()){
                temp+=word1.charAt(i)+"";
                i++;
            }
            if(j<word2.length()){
                temp+=word2.charAt(j)+"";
                j++;
            }

        }
        return temp;
    }
}
