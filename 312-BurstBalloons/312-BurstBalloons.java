// Last updated: 6/8/2025, 11:11:54 pm
class Solution {
    public int maxCoins(int[] nums) {
        int [] arr = new int[nums.length+2];
		arr[0]=arr[arr.length-1]=1;
		for(int i=0;i<nums.length;i++) {
			arr[i+1]=nums[i];
		}
		int[][]dp=new int[arr.length][arr.length];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
        return MaxCoins(arr,0,arr.length-1,dp);
    }
    public static int MaxCoins(int[]arr, int si, int ei,int[][]dp) {
		if(si+1==ei) {
			return 0;
		}
		if(dp[si][ei]!=-1) {
			return dp[si][ei];
		}
		int ans=Integer.MIN_VALUE;
		for(int k=si+1;k<ei;k++) {
			int left = MaxCoins(arr,si,k,dp);
			int right = MaxCoins(arr,k,ei,dp);
			int self = arr[si]*arr[k]*arr[ei];
			ans = Math.max(ans, self+right+left);
		}
		return dp[si][ei]=ans;
	}
}