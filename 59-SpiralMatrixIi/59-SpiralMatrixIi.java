// Last updated: 6/8/2025, 11:14:35 pm
class Solution {
    public int[][] generateMatrix(int n) {
        int[][]arr=new int[n][n];
        int te=1;
        int minc=0;
        int maxc=n-1;
        int minr=0;
        int maxr=n-1;
        while(te<=n*n){
            for(int i=minc;i<=maxc && te<=n*n;i++){
                arr[minr][i]=te;
                te++;
            }
            minr++;
            for(int i=minr;i<=maxr && te<=n*n;i++){
                arr[i][maxc]=te;
                te++;
            }
            maxc--;
            for(int i=maxc;i>=minc && te<=n*n;i--){
                arr[maxr][i]=te;
                te++;
            }
            maxr--;
            for(int i=maxr;i>=minr && te<=n*n;i--){
                arr[i][minc]=te;
                te++;
            }
            minc++;
        }
        return arr;
    }
}