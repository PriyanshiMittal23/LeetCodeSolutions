// Last updated: 6/8/2025, 11:15:26 pm
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int a=0;
        while(n>0){
            int r=n%10;
            a=a*10+r;
            n=n/10;
        }
        if(a==x){
            return true;
        }
        return false;
        
    }
}