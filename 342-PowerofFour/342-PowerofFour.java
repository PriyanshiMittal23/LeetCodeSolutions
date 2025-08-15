// Last updated: 15/8/2025, 4:44:38 pm
class Solution {
    public boolean isPowerOfFour(int n) {
        int p = 0;
        if(n<=0){
            return false;
        }
        if((n&(n-1))!=0){
            return false;
        }
        while(n>0){
            n= (n>>1);
            p++;
        }
        if(p%2==0){
            return false;
        }
        return true;
    }
}