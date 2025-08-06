// Last updated: 6/8/2025, 11:05:39 pm
class Solution {
    public int minChanges(String s) {
        int i=0;
        int ans=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            char c = s.charAt(i+1);
            if(ch!=c){
                ans++;
            }
            i=i+2;
        }
        return ans;
    }
}