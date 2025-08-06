// Last updated: 6/8/2025, 11:06:18 pm
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int []ans=new int[2];
        for(int i=0;i<mat.length;i++){
            int a=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    a++;
                }
            }
            if(a>ans[1]){
                ans[1]=a;
                ans[0]=i;
            }
        }
        return ans;
    }
}