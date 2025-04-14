//https://leetcode.com/problems/find-pivot-index/description/
class Solution {
    public int pivotIndex(int[] arr) {
    int left=0;
	int right=0;
	for(int i=0;i<arr.length;i++) {
		right+=arr[i];
	}
	for(int j=0;j<arr.length;j++) {
		right-=arr[j];
		if(left==right) {
			return j;
		}
		left+=arr[j];
		
	}
	return -1;
    }
}
