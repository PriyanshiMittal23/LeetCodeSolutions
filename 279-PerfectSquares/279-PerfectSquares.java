// Last updated: 6/8/2025, 11:12:05 pm
class Solution {
    public int numSquares(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return perfect(n,dp);
    }

    public int perfect(int n,int[]dp){
        if(n<4){
            return dp[n]=n;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int ans=n;
        for(int i=1;i*i<=n;i++){
            ans = Math.min(ans,1+perfect(n-(i*i),dp));
        }
        return dp[n]=ans;
    }
}