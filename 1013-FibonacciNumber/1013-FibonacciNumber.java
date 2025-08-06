// Last updated: 6/8/2025, 11:09:44 pm
class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if(n==0 || n==1){
            return n;
        }
        for(int i=2;i<=n;i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}