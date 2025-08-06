// Last updated: 6/8/2025, 11:15:07 pm
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int a=0;a<nums.length;a++){
            if(nums[a]!=val){
                nums[k]=nums[a];
                k++;
            }
        }
        return k;
        
    }
}