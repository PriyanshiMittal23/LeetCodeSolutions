// Last updated: 6/8/2025, 11:13:04 pm
class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int c=0;
        for(int val:nums){
            if(c==0){
                ans=val;
            }
            if(ans==val){
                c++;
            }
            else{
                c--;
            }
        }
        return ans;
    }
}