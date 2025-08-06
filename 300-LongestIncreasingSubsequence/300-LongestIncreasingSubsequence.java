// Last updated: 6/8/2025, 11:11:56 pm
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int a = dp[j]+1;
                    dp[i]=Math.max(dp[i],a);
                }
            }
        }
        int max = dp[0];
		for (int i = 1; i < dp.length; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}
		return max;
    }
}