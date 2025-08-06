// Last updated: 6/8/2025, 11:14:31 pm
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
        return mPS(grid,0,0,dp);
    }
    public static int mPS(int[][] arr, int i, int j, int[][] dp) {

		if (i == arr.length - 1 && j == arr[0].length - 1) {
			return arr[i][j];
		}
		if (i >= arr.length || j >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int hz = mPS(arr, i , j+1, dp);
		int vc = mPS(arr, i+1, j , dp);
		return dp[i][j] = Math.min(hz, vc) + arr[i][j];
	}

}