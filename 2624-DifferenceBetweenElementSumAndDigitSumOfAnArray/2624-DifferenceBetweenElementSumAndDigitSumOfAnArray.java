// Last updated: 6/8/2025, 11:06:44 pm
class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            a=a+nums[i];
            b=b+add(nums[i]);
        }
        return (Math.abs(a-b));
        
    }
    public static int add(int n){
        int b=0;
        while(n>0){
            b=b+n%10;
            n=n/10;
        }
        return b;
    }
}