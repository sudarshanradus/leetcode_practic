//https://leetcode.com/problems/robot-return-to-origin/description/
class Solution {
    public boolean judgeCircle(String moves) {
        int du=0;
        int lr=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                du++;
            }
            else if(moves.charAt(i)=='D'){
                du--;
            }
            else if(moves.charAt(i)=='L'){
                lr++;
            }
            else{
                lr--;
            }
        }
        return  du==0 && lr==0;
    }
}
