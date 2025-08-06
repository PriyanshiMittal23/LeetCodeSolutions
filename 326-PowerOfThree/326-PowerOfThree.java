// Last updated: 6/8/2025, 11:11:53 pm
class Solution {
    public boolean isPowerOfThree(int n) {
        return powthree(n,0);
    }
    public static boolean powthree(int n,int r){
        if(n<0){
            return false;
        }
        if(Math.pow(3,r)==n){
            return true;
        }
        if(Math.pow(3,r)>n){
            return false;
        }
        return powthree(n,r+1);
    }
}