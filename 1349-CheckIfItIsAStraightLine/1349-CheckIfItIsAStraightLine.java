// Last updated: 6/8/2025, 11:09:08 pm
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        return cSL(coordinates);
    }
    public static boolean cSL(int[][]arr){
        int x=arr[0][0];
        int y=arr[0][1];
        int x1=arr[1][0];
        int y1=arr[1][1];
        for(int i=2;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            if((x1-x)*(b-y)!=(a-x)*(y1-y)){
                return false;
            }
        }
        return true;
    }
}