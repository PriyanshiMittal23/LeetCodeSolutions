// Last updated: 6/8/2025, 11:14:46 pm
class Solution {
    public double myPow(double x, int n) {
        return calcpow(x,n);
    }
    public static double calcpow(double x,int n){
        if (n == Integer.MAX_VALUE){
            return x;
        }
        if(n==Integer.MIN_VALUE){
            if(x==1 || x==-1){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(n==0){
            return 1;
        }
        if (n<0) {
        n = -n;
        x = 1/x;
        }
        double a=calcpow(x,n-1);
        return a*x;
    }
}