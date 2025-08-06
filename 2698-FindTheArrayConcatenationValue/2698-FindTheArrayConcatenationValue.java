// Last updated: 6/8/2025, 11:06:27 pm
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int a=0;
        int b=nums.length-1;
        long ans=0;
        while(a<b){
            String s="";
            s=s+nums[a]+nums[b];
            int i=Integer.parseInt(s);
            ans=ans+i;
            a++;
            b--;
        }
        if(a==b){
            ans=ans+nums[a];
        }
        return ans;
    }
}