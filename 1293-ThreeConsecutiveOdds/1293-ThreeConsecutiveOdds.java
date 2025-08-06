// Last updated: 6/8/2025, 11:09:19 pm
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd=0;
        for(int a:arr){
            if(a%2!=0){
                odd++;
            }
            else{
                odd=0;
            }
            if(odd==3){
                return true;
            }
        }
        return false;
    }
}