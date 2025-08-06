// Last updated: 6/8/2025, 11:05:24 pm
class Solution {
    public boolean canSortArray(int[] nums) {
        int pm = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int cma = nums[i];
            int cm = nums[i];
            while(i+1<nums.length && (setBits(nums[i])==setBits(nums[i+1]))){
                i++;
                cma = Math.max(cma,nums[i]);
                cm = Math.min(cm,nums[i]);
                // i++;
            }
            if(pm>cm){
                return false;
            }
            pm=cma;
        }
        return true;
    }

    public int setBits(int n){
        int c = 0;
        while(n!=0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}