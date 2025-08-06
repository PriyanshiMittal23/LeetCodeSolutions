// Last updated: 6/8/2025, 11:08:57 pm
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[]row=new int[matrix.length];
        int[]col=new int[matrix[0].length];
        Arrays.fill(row,Integer.MAX_VALUE);
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                row[i]=Math.min(row[i],matrix[i][j]);
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<row.length;j++){
                col[i]=Math.max(col[i],matrix[j][i]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int a=matrix[i][j];
                if(row[i]==a && col[j]==a){
                    ans.add(a);
                }
            }
        }
        return ans;
    }
}