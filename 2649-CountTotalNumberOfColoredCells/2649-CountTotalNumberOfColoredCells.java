// Last updated: 6/8/2025, 11:06:38 pm
class Solution {
    public long coloredCells(int n) {
        return nocc(n);
    }
    public static long nocc(int n){
        if(n==1){
            return 1;
        }
        long a=nocc(n-1);
        long b=a+4*(n-1);
        return b;
    }
}