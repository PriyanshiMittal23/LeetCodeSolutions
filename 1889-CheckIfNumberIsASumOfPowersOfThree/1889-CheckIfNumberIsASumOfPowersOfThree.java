// Last updated: 6/8/2025, 11:08:12 pm
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>1){
            if(n%3==2){
                return false;
            }
            n= n/3;
        }
        return true;
    }
}