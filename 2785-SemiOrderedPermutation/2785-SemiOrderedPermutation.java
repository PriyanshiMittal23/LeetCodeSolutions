// Last updated: 6/8/2025, 11:06:11 pm
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int i=0;
        int a=0;
        while(nums[i]!=1){
            i++;
        }
        for(int j=i;j>0;j--){
            // int temp=arr[i];
            nums[j]=nums[j-1];
            nums[j-1]=1;
            a++;
        }
        // for(int j=0;j<nums.length;j++){
        //     System.out.print(nums[i]);
        // }
        i=0;
        while(nums[i]!=nums.length){
            i++;
        }
        a=a+(nums.length-1-i);
        return a;
    }
}