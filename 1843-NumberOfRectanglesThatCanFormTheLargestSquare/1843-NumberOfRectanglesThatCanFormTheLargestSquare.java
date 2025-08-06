// Last updated: 6/8/2025, 11:08:15 pm
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        return max(rectangles);
    }
    public static int max(int[][]arr){
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=Math.min(arr[i][1],arr[i][0]);
        }
        int a=1;
        Arrays.sort(ans);
        for(int i=ans.length-2;i>=0;i--){
            if(ans[i]==ans[ans.length-1]){
                a=a+1;
            }
            else{
                break;
            }
        }
        return a;
    }
}