// Last updated: 2/11/2025, 11:31:54 pm
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][] arr = new int[m][n];
        for(int[]a:guards){
            arr[a[0]][a[1]] = 2;
        }
        for(int[]a:walls){
            arr[a[0]][a[1]] = 2;
        }
        for(int []g: guards){
            for(int j=g[0]-1;j>=0;j--){
                if(arr[j][g[1]]==2){
                    break;
                }
                arr[j][g[1]]=1;
            }
            for(int j=g[0]+1;j<m;j++){
                if(arr[j][g[1]]==2){
                    break;
                }
                arr[j][g[1]]=1;
            }
            for(int j=g[1]-1;j>=0;j--){
                if(arr[g[0]][j]==2){
                    break;
                }
                arr[g[0]][j]=1;
            }
            for(int j=g[1]+1;j<n;j++){
                if(arr[g[0]][j]==2){
                    break;
                }
                arr[g[0]][j]=1;
            }
        }
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    // System.out.println(i+" "+j);
                    ans++;
                }
            }
        }
        return ans;
    }
}