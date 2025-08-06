// Last updated: 6/8/2025, 11:11:40 pm
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return count(n);
    }

    public static int count(int n){
        if(n==0){
            return 1;
        }
        int c=9;
        for(int i=2;i<=n;i++){
            c=c*(11-i);
        }
        return c+count(n-1);

    }
}