//https://leetcode.com/problems/first-unique-character-in-a-string/description/
class Solution {
    public int firstUniqChar(String str) {
      int[] count = new int[26]; 
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
       return -1;
    }

}
