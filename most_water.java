//https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] height) {
        int sum=0;
		int max=0;
        int i=0; int j=height.length-1;
        while(i<j){
        	sum=j-i;
        	if(height[i]<height[j]) {
        		sum*=height[i];
        	}
        	else {
        		sum*=height[j];
        	}
        	if(max<sum) {
            	max=sum;
            }
            if(height[i]<height[j]){
                i++;   
            }
            else {
        		j--;
        	}
        }
        return max;
    }
}
