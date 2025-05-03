//https://leetcode.com/problems/intersection-of-two-arrays/description/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
	    HashSet<Integer> dem =new HashSet<>();
	    for(int i=0;i<nums1.length;i++) {
	    	hs.add(nums1[i]);
	    }
	    for(int j=0;j<nums2.length;j++) {
	    	if(hs.contains(nums2[j])){
	    		dem.add(nums2[j]);
	    	}
	    }
	    int indx=0;
        int[] ans = new int[dem.size()];
        for(int num : dem){
            ans[indx++]=num;
        }
	    
	    return ans;
    }
}
