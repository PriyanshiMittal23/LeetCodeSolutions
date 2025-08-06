// Last updated: 6/8/2025, 11:11:22 pm
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                idx=nums[i]*-1-1;
            }
            else{
                idx=nums[i]-1;
            }
            if(nums[idx]>0){
                nums[idx]=nums[idx]*-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}