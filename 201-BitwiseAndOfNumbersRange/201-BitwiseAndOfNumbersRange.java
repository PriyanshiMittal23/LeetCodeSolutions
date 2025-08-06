// Last updated: 6/8/2025, 11:12:49 pm
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==right){
            return left;
        }
        while(left<right){
            right&=right-1;
        }
        return right;
    }
}