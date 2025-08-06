// Last updated: 6/8/2025, 11:09:59 pm
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int a = 0;
        int t = rows*cols;
        int n=0;
        int[][]ans = new int[t][2];
        int dx=0;
        int dy=1;
        while(a<t){
            for(int i=0;i<n/2+1;i++){
                if(rStart<rows && rStart>=0 && cStart<cols && cStart>=0){
                    ans[a++] = new int[]{rStart,cStart};
                }
                rStart+=dx;
                cStart+=dy;
            }
            n++;
            int temp = dx;
            dx=dy;
            dy=-temp;
        }
        return ans;
    }
}