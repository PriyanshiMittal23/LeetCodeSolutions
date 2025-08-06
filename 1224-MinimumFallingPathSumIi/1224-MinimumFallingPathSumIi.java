// Last updated: 6/8/2025, 11:09:27 pm
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int ans=Integer.MAX_VALUE;
        for (int[] a : dp) {
			    Arrays.fill(a,-1);
            }
        for(int i=0;i<grid.length;i++){
            
            int p=mPFS(grid,i,0,dp);
            ans=Math.min(ans,p);
        }
        return ans;
    }
    public static int mPFS(int[][]grid,int c,int r,int[][]dp) {
		if(r>=grid.length || c>=grid[0].length || c<0)
        return Integer.MAX_VALUE;
        if(r==grid.length-1) {
			return grid[r][c];
		}
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<grid[0].length;i++) {
			if(i!=c) {
				int p=mPFS(grid,i,r+1,dp);
				ans=Math.min(ans, p);
			}
		}
		return dp[r][c]=ans+grid[r][c];
	}

}