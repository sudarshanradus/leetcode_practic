//https://leetcode.com/problems/reverse-prefix-of-word/description/
class Solution {
    public String reversePrefix(String word, char ch) {
        String temp="";
        int i=0;
        for(i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
        for(int j=i;j>=0;j--){
            temp+=word.charAt(j)+"";
        }
                break;
            }
        }
        if(i==word.length()) {
            return word;
    }
        for(int k=i+1;k<word.length();k++){
            temp+=word.charAt(k)+"";
        }
        return temp;
    }
}
