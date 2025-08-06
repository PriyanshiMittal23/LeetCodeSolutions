// Last updated: 6/8/2025, 11:09:54 pm
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for (int[] a : dp) {
			    Arrays.fill(a,1000000);
            }
            int p=mPS(matrix,0,i,dp);
            ans=Math.min(ans,p);
        }
        return ans;
    }
    public static int mPS(int[][] arr, int i, int j, int[][] dp) {
        if (i >= arr.length || j >= arr[0].length || i<0 || j<0) {
			return Integer.MAX_VALUE;
		}
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		if (dp[i][j] != 1000000) {
			return dp[i][j];
		}
		int hz = mPS(arr, i+1 , j-1, dp);
		int vc = mPS(arr, i+1, j , dp);
        int rd = mPS(arr, i+1, j+1, dp);
		return dp[i][j] = Math.min(hz, Math.min(vc,rd)) + arr[i][j];
	}

}