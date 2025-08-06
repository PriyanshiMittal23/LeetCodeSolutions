// Last updated: 6/8/2025, 11:14:43 pm
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int a=0;
        ArrayList<Integer> list = new ArrayList<>();
        int mr=0;
        int mc=0;
        int r=matrix.length-1;
        int c=matrix[0].length-1;
        int b=matrix.length*matrix[0].length;
        while(a<b){
            for(int i=mc;i<=c && a<b;i++){
                list.add(matrix[mr][i]);
                a++;
            }
            mr++;
            for(int i=mr;i<=r && a<b;i++){
                list.add(matrix[i][c]);
                a++;
            }
            c--;
            for(int i=c;i>=mc && a<b;i--){
                list.add(matrix[r][i]);
                a++;
            }
            r--;
            for(int i=r;i>=mr&& a<b;i--){
                list.add(matrix[i][mc]);
                a++;
            }
            mc++;
        }
        return list;
    }
}