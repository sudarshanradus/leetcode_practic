//https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String removeStars(String s) {
        Stack<String> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i)+"");
            }
            else{
                st.pop();
            }
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;  
        }
        return ans;
    }
}
