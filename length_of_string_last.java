//https://leetcode.com/problems/length-of-last-word/description/
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
                count++;
        }
        return count;
    }
}
