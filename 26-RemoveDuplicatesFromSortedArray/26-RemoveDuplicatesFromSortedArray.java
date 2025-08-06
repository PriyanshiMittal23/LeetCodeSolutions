// Last updated: 6/8/2025, 11:15:08 pm
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[idx++]=nums[i];
            }
        }
        return idx;
    }
}