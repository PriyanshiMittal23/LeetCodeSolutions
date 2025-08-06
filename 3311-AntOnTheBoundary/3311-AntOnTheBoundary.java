// Last updated: 6/8/2025, 11:05:21 pm
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0;
        int a=0;
        for(int i:nums){
            a+=i;
            if(a==0){
                c++;
            }
        }
        return c;
    }
}