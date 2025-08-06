// Last updated: 6/8/2025, 11:11:11 pm
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                a++;
            }
            else{
                ans=Math.max(ans,a);
                a=0;
            }
            
        }
        return Math.max(ans,a);
    }
}