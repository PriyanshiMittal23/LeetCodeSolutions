// Last updated: 6/8/2025, 11:13:24 pm
class Solution {
    public int singleNumber(int[] nums) {
        return unique(nums);
    }

    public static int unique(int[]nums){
        int ans=0;
        for(int i=0;i<=31;i++){
            int nob=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)==1){
                    nob++;
                    nob=nob%3;
                }
            }
            if(nob!=0){
                ans = (ans|(nob<<i));
            }
        }
        return ans;
    }
}