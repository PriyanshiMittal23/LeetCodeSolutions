// Last updated: 6/8/2025, 11:12:13 pm
class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        for(int i=2;i<6;i++){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
}