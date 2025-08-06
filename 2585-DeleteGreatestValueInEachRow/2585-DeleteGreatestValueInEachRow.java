// Last updated: 6/8/2025, 11:06:52 pm
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int a=0;
        int ans=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                a=Math.max(a,grid[j][i]);
            }
            ans=ans+a;
        }
        return ans;
    }
}