// Last updated: 6/8/2025, 11:10:05 pm
class Solution {
    public int binaryGap(int n) {
        int ans=0;
        int c=1;
        while(n!=0){
            if((n&1)==1){
                n>>=1;
                break;
            }
            n>>=1;
        }
        while(n!=0){
            if((n&1)==1){
                ans=Math.max(c,ans);
                c=1;
            }else{
                c++;
            }
            n>>=1;
        }
        return ans;
    }
}