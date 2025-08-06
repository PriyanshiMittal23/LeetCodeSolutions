// Last updated: 6/8/2025, 11:05:02 pm
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=grid[i+1][j]){
                    return false;
                }
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length-1;j++){
                if(grid[i][j]==grid[i][j+1]){
                    return false;
                }
            }
        }

        return true;
    }
}