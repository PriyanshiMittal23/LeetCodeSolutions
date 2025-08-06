// Last updated: 6/8/2025, 11:10:10 pm
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length<3 || grid[0].length<3){
            return 0;
        }
        int ans=0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
                if(isMS(grid,i,j)){
                    ans++;
                }
            }
        }

        return ans;
    }

    public boolean isMS(int[][]arr,int r,int c){
        HashSet<Integer> hs = new HashSet<>();
        int ans=0;
        for(int i=c;i<=c+2;i++){
            ans+=arr[r][i];
            if(hs.contains(arr[r][i])|| arr[r][i]>9 || arr[r][i]<=0){
                return false;
            }
            hs.add(arr[r][i]);
        }
        for(int i=r+1;i<=r+2;i++){
            int sum=0;
            for(int j=c;j<=c+2;j++){
                if(hs.contains(arr[i][j]) || arr[i][j]>9 || arr[i][j]<=0){
                    return false;
                }
                hs.add(arr[i][j]);
                sum+=arr[i][j];
            }
            if(sum!=ans){
                return false;
            }
        }
        for(int i=c;i<=c+2;i++){
            int sum=arr[r][i]+arr[r+1][i]+arr[r+2][i];
            if(sum!=ans){
                return false;
            }
        }
        int sum = arr[r][c]+arr[r+1][c+1]+arr[r+2][c+2];
        if(sum!=ans){
            return false;
        }
        sum=arr[r][c+2]+arr[r+1][c+1]+arr[r+2][c];
        if(sum!=ans){
            return false;
        }
        return true;
    }
}