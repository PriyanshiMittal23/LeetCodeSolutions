// Last updated: 6/8/2025, 11:08:46 pm
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []a=new int[2*n];
        for(int i=0;i<n;i++){
            a[2*i]=nums[i];
            a[2*i+1]=nums[n+i];
        }
        return a;
    }
}