// Last updated: 6/8/2025, 11:11:25 pm
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int a:nums){
            int abs=Math.abs(a);
            if(nums[abs-1]<0){
                ans.add(abs);
            }
            else{
                nums[abs-1]*=-1;
            }
        }
        return ans;
    }
}