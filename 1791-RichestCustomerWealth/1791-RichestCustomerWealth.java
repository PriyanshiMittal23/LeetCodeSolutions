// Last updated: 6/8/2025, 11:08:22 pm
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            int a=0;
            for(int j=0;j<accounts[0].length;j++){
                a=a+accounts[i][j];
            }
            ans=Math.max(ans,a);
        }
        return ans;
    }
}