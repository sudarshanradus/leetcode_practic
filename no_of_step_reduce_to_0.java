//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
class Solution {
    public int numberOfSteps(int num) {
        int step=0;
	while(num>0) {
		if(num%2==0) {
			num/=2;
			step++;
		}
		else {
			step++;
			num--;
		}
	}
	return step;
    }
}
