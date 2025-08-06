// Last updated: 6/8/2025, 11:12:24 pm
class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        if(n<=0){
            return false;
        }
        while(n>0){
            n=(n&(n-1));
            c++;
            if(c>1){
                return false;
            }
        }
        return true;
    }
}