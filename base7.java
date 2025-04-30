//https://leetcode.com/problems/base-7/description/
class Solution {
    public String convertToBase7(int num) {	 
        if(num==0){
            return "0";
        }  
	    String str1="";
	    if(num<0) {
	    	num=-num;
	    	str1="-";
	    }
	    String str="";
	    while(num>0) {
	    	int r = num%7;
	    	str+=r;
	    	num/=7;
	    }
	    	for(int i=str.length()-1;i>=0;i--) {
	    		str1+=str.charAt(i);
	    	}
	    	return str1;
    }
}
