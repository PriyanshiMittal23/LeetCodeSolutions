// Last updated: 6/8/2025, 11:06:12 pm
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[]arr=new int[51];
        int[]ans=new int[A.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            ans[i]=c;
            int a = ++arr[A[i]];
            if(a==2){
                ans[i]=++c;
            }
            int b = ++arr[B[i]];
            if(b==2){
                ans[i]=++c;
            }
        }
        return ans;
    }
}