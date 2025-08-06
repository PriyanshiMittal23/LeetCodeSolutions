// Last updated: 6/8/2025, 11:09:33 pm
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][]dp=new int[nums1.length+1][nums2.length+1];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return lcs(nums1,nums2,0,0,dp);
    }

    public int lcs(int[]nums1,int[]nums2,int i,int j,int[][]dp){
        if(nums1.length==i || j==nums2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = 0;
        if(nums1[i]==nums2[j]){
            ans+=1+lcs(nums1,nums2,i+1,j+1,dp);
        }else{
            int fn = lcs(nums1,nums2,i+1,j,dp);
            int ln = lcs(nums1,nums2,i,j+1,dp);
            ans = Math.max(fn,ln);
        }
        return dp[i][j]=ans;
    }
}