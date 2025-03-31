// https://leetcode.com/problems/roman-to-integer/description/
class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = roman(s.charAt(i));
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }
        return total;
}
public static int roman(char s) {
	if(s=='I') {
		return 1;
	}
	else if(s=='V'){
			return 5;
	}
	else if(s=='X'){
		return 10;
	}
	else if(s=='L'){
		return 50;
	}
	else if(s=='C'){
		return 100;
	}
	else if(s=='D'){
		return 500;
	}
	else if(s=='M'){
		return 1000;
	}
	return 0;
}
}
