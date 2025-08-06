// Last updated: 6/8/2025, 11:10:53 pm
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat[0].length;
        int n=mat.length;
        if(r*c!=m*n){
            return mat;
        }
        int a=0;
        int b=0;
        int [][]ans=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat[a][b];
                b++;
                if(b==m){
                    b=0;
                    a++;
                }
            }
        }
        return ans;
    }
}