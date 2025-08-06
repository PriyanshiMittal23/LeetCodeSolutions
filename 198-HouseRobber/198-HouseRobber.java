// Last updated: 6/8/2025, 11:12:52 pm
class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp, -1);
        return Robber_dp_opp(nums,nums.length-1,dp);
        
    }
    public static int Robber_dp(int[]nums, int i, int []dp) {
		if(i>=nums.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int loot=nums[i]+Robber_dp(nums,i+2,dp);
		int not_loot=Robber_dp(nums,i+1,dp);
		return dp[i]=Math.max(loot, not_loot);
	}
    public static int Robber_dp_opp(int[]nums, int i, int []dp) {
		if(i<0) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int loot=nums[i]+Robber_dp_opp(nums,i-2,dp);
		int not_loot=Robber_dp_opp(nums,i-1,dp);
		return dp[i]=Math.max(loot, not_loot);
	}
}