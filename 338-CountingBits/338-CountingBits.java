// Last updated: 6/8/2025, 11:11:47 pm
class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=noOfSetBits(i);
        }
        return ans;
    }

    public int noOfSetBits(int n){
        int c=0;
        while(n!=0){
            c++;
            n=(n&(n-1));
        }
        return c;
    }
}