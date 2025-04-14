//https://leetcode.com/problems/max-number-of-k-sum-pairs/description/
class Solution {
    public int maxOperations(int[] arr, int k) {
		Arrays.sort(arr);
		int count=0;
		int j=arr.length-1;
		int i=0;
		while(i<j) {
			if(j>=0&&(arr[i]+arr[j])==k) {
				j--;
				i++;
				count++;
			}
			else if(j>=0&&(arr[i]+arr[j])>=k) {
				j--;
			}
			else if(j>=0&&arr[i]+arr[j]<=k) {
				i++;
			}
		}
		return count;
    }
}
