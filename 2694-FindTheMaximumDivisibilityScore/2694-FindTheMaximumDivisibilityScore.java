// Last updated: 6/8/2025, 11:06:29 pm
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans=0;
        int b=0;
        for(int i=0;i<divisors.length;i++){
            int a=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0){
                    a++;
                }
            }
            if(a>ans){
                ans=a;
                b=divisors[i];
            }
            else if(a==ans){
                int c=divisors[i];
                b=Math.min(b,c);
            }
        }
        Arrays.sort(divisors);
        if(ans==0){
            return divisors[0];
        }
        return b;
    }
}