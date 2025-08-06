// Last updated: 6/8/2025, 11:08:27 pm
class Solution {
    public int minimumDeletions(String s) {
        return solve(s);
    }

    public int solve(String s){
        int b=0;
        int ans=0;
        for(char ch: s.toCharArray()){
            if(ch=='a'){
                ans = Math.min(ans+1,b);
            }
            else{
                b++;
            }
        }
        return ans;
    }
}