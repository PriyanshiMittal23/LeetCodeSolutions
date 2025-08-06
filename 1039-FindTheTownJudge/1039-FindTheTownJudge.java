// Last updated: 6/8/2025, 11:09:39 pm
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr=new int[n+1];
        for(int[]a:trust){
            arr[a[0]]--;
            arr[a[1]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}