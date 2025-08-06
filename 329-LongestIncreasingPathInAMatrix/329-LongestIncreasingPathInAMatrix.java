// Last updated: 6/8/2025, 11:11:51 pm
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int ans=0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int a = lonp(matrix,i,j,-1,dp);
                ans=Math.max(ans,a);
            }
        }
        return ans;
    }

    public int lonp(int[][]arr, int cr, int cc, int p,int[][] dp){
        if(cr>=arr.length || cr<0 || cc<0 || cc>=arr[0].length || arr[cr][cc]<=p){
            return 0;
        }
        if(dp[cr][cc]!=0){
            return dp[cr][cc];
        }
        int ans = 0;
        int[]r = {0,0,1,-1};
        int[]c = {1,-1,0,0};
        int t=arr[cr][cc];
        // arr[cr][cc]=-1;
        for(int i=0;i<c.length;i++){
            int a = lonp(arr,cr+r[i],cc+c[i],t,dp)+1;
            ans=Math.max(a,ans);
        }
        // arr[cr][cc]=t;
        return dp[cr][cc]=ans;
    }
}