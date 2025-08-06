// Last updated: 6/8/2025, 11:05:34 pm
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length*grid.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        int[]ans = new int[2];
        for(int[]a:grid){
            for(int b:a){
                arr[b-1] ^= b;
                if(arr[b-1]!=0){
                    ans[0]=b;
                }
            }
        }
        
        for(int a:arr){
            if(a!=0 && a!=ans[0]){
                ans[1]=a;
            }
        }
        return ans;
    }
}