// Last updated: 6/8/2025, 11:14:09 pm
class Solution {
    public int removeDuplicates(int[] nums) {
        int a=1;
        int j=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                a++;
            }
            else{
                a=1;
            }
            if(a<=2){
                nums[j++]=nums[i];
                ans++;
            }
        }
        return ans;
    }
}