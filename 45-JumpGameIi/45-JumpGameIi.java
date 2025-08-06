// Last updated: 6/8/2025, 11:14:53 pm
class Solution {
    public int jump(int[] nums) {
        long[]dp=new long[nums.length];
        Arrays.fill(dp,-1);
        int ans = (int)(minJump(nums,0,dp));
        return ans;
    }

    public long minJump(int[]nums,int i,long[]dp){
        if(i==nums.length-1){
            return 0;
        }
        if(i>=nums.length){
            return Integer.MAX_VALUE;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        long ans=Integer.MAX_VALUE;
        for(int a=1;a<=nums[i];a++){
            ans = Math.min(ans,minJump(nums,i+a,dp)+1);
        }
        return dp[i]=ans;
    }
}