// Last updated: 15/8/2025, 4:39:56 pm
class Solution {
    public boolean isPowerOfFour(int n) {
        int c=0;
        int t=n;
        int p = 0;
        if(n<=0){
            return false;
        }
        while(n>0){
            n = (n&(n-1));
            c++;
            if(c>1){
                return false;
            }
        }
        while(t>0){
            t= (t>>1);
            p++;
        }
        if(p%2==0){
            System.out.println(p);
            return false;
        }
        return true;
    }
}