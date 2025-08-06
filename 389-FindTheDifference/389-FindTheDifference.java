// Last updated: 6/8/2025, 11:11:31 pm
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char ch:s.toCharArray()){
            ans ^=ch;
        }
        for(char ch:t.toCharArray()){
            ans ^= ch;
        }
        return ans;
    }
}