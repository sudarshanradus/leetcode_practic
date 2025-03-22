// https://leetcode.com/problems/excel-sheet-column-title/description/
class Solution {
    public String convertToTitle(int a) {
       StringBuilder temp = new StringBuilder();
	while (a !=0){	
        a--;
			temp.append(String.valueOf((char)('A'+ (a%26))));
			System.out.println(temp);
			
		
		a/=26;
	}
	return temp.reverse().toString();

    }
}
