// Last updated: 6/8/2025, 11:09:31 pm
class Solution {
    public int heightChecker(int[] heights) {
        int ans=0;
        int n=heights.length;
        int[]arr=new int[n];
        for(int i:heights){
            arr[ans]=i;
            ans++;
        }
        ans=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=heights[i]){
                ans++;
            }
        }
        return ans;
    }
}