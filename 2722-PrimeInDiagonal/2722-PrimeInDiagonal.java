// Last updated: 6/8/2025, 11:06:24 pm
class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans=0;
        int a=0;
        int b=0;
        if(nums.length!=nums[0].length){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(isprime(nums[i][i])){
                a=nums[i][i];
            }
            if(isprime(nums[i][nums.length-i-1])){
                b=nums[i][nums.length-i-1];
            }
            b=Math.max(a,b);
            ans=Math.max(b,ans);
            
        }
        return ans;
    }
    public static boolean isprime(int a){
        if(a==1){
            return false;
        }
        if(a==2){
            return true;
        }
        int div = 2;
		while (div * div <= a) {
			if(a%div==0) {
				return false;
			}
			div++;
		}
		return true;
    }
}