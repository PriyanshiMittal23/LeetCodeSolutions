// Last updated: 6/8/2025, 11:09:41 pm
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]ans=new int[nums.length];
        int a=0;
        int b=nums.length-1;
        int p=b;
        while(a<=b){
            int c=nums[a]*nums[a];
            int d=nums[b]*nums[b];
            if(c<d){
                ans[p]=d;
                b--;
                p--;
            }
            else{
                ans[p]=c;
                a++;
                p--;
            }
        }
        return ans;
    }
}