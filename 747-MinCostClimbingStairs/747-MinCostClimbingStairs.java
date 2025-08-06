// Last updated: 6/8/2025, 11:10:22 pm
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(min(cost,0,dp),min(cost,1,dp));
    }
    public static int min(int[]arr,int idx,int[]dp){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int one = min(arr,idx+1,dp);
        int two = min(arr,idx+2,dp);
        return dp[idx]=Math.min(one,two)+arr[idx];
    }
}