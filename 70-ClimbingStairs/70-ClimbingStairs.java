// Last updated: 6/8/2025, 11:14:23 pm
class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return climbs(n,1,dp);
    }
    public static int climbs(int n,int i,int[]dp){
        if(i>=n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one=climbs(n,i+1,dp);
        int two=climbs(n,i+2,dp);
        return dp[i]=one+two;

    }
}