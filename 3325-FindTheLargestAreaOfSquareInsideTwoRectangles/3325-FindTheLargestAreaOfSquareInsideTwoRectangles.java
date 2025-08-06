// Last updated: 6/8/2025, 11:05:17 pm
class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long ans=0;
        for(int i=0;i<bottomLeft.length;i++){
            for(int j=i+1;j<bottomLeft.length;j++){
                int x=Math.max(0,Math.min(topRight[i][0],topRight[j][0])-Math.max(bottomLeft[i][0],bottomLeft[j][0]));
                int y=Math.max(0,Math.min(topRight[i][1],topRight[j][1])-Math.max(bottomLeft[i][1],bottomLeft[j][1]));
                int p=Math.min(x,y);
                long a=(long)p*p;
                ans=Math.max(a,ans);
            }
        }
        return ans;
    }
}