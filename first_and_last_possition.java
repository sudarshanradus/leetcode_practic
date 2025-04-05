//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans= binarysearch(nums,target,0,nums.length-1);
        if(ans==-1){
            return new int[]{-1,-1};
        }else{
            int a=ans,b=ans;
            while(a>=0&&nums[a]==target){
                a--;
            }
            while(b<nums.length&&nums[b]==target){
                b++;
            }
            return new int[] {a+1,b-1};
            }

    }
    public static int binarysearch(int[] nums,int target,int start,int end){
        while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        }
        return -1;
    
    }
}
