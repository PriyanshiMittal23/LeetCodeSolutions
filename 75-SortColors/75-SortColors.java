// Last updated: 6/8/2025, 11:14:17 pm
class Solution {
    public void sortColors(int[] nums) {
        int r=0;
        int c=nums.length-1;
        for(int i=0;i<=c;i++){
            if(nums[i]==2 ){
                int t=nums[c];
                nums[c]=2;
                nums[i]=t;
                c--;
                i--;
            }
            else if(nums[i]==0){
                int t=nums[r];
                nums[r]=0;
                nums[i]=t;
                r++;
                
            }
        }
        
    }
}