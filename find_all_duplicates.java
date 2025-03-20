//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> ans = new ArrayList<>();
        while (i<nums.length){
            int temp=nums[i]-1;
            if (nums[i]!=nums[temp]){
                int temp1=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp1;
            }
            else{
                i++;
            }
        }
        for (int j =0;j<nums.length;j++){
            if (nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}
