//https://leetcode.com/problems/goal-parser-interpretation/description/
class Solution {
    public String interpret(String c) {
        String temp="";
        int i=0;
        while (i<c.length()){
            if(c.charAt(i)=='(' && c.charAt(i+1)==')'){
                temp+='o';
                i+=2;
            }
            else if(c.charAt(i)=='(' && c.charAt(i+1)=='a'){
                temp+="al";
                i+=4;
            }
            else{
                temp+=c.charAt(i);
                i++;
            }
        }
        return temp;
    }
}
