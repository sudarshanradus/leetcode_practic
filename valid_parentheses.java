//https://leetcode.com/problems/valid-parentheses/description/
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<String> sh = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='[' || s.charAt(i)=='{'){
                sh.push(s.charAt(i)+"");
            }
            if(s.charAt(i)==')'){
               if(sh.size()!=0&&sh.peek().equals("(")) {
            	   sh.pop();
               }
               else {
            		return false;
            	}
            }
            if(s.charAt(i)==']') {
            	if(sh.size()!=0&&sh.peek().equals("[")) {
            		sh.pop();
            	}
                else {
            		return false;
            	}
            }
            if(s.charAt(i)=='}') {
            	if(sh.size()!=0&&sh.peek().equals("{")) {
            		sh.pop();
            	}
                else {
            		return false;
            	}
            }
        }
        return sh.size()==0;
    }
}
