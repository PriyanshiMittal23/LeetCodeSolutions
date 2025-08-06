// Last updated: 6/8/2025, 11:05:12 pm
class Solution {
    public long countSubstrings(String s, char c) {
        long f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                f++;
            }
        }
        return f*(f+1)/2;
    }
}