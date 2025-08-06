// Last updated: 6/8/2025, 11:04:41 pm
class Solution {
    public int possibleStringCount(String word) {
        char prev = word.charAt(0);
        int ans = 1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==prev){
                ans++;
            }else{
                prev = word.charAt(i);
            }
        }
        return ans;
    }
}